import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

class BankAccount {
    private int balance;
    private final DefaultTableModel tableModel;
    private final AtomicInteger transactionId;
    private final boolean isSynchronized;

    public BankAccount(int initialBalance, DefaultTableModel tableModel, boolean isSynchronized) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        this.balance = initialBalance;
        this.tableModel = tableModel;
        this.transactionId = new AtomicInteger(1);
        this.isSynchronized = isSynchronized;
    }

    private void addTransactionRecord(String user, int amount, int remainingBalance, String status) {
        SwingUtilities.invokeLater(() -> tableModel.addRow(new Object[]{
            transactionId.getAndIncrement(),
            user,
            "$" + amount,
            "$" + remainingBalance,
            status
        }));
    }

    private boolean withdrawUnsynchronized(int amount, String userName) {
        if (balance >= amount) {
            try {
                Thread.sleep(100); // Simulate processing time
                int newBalance = balance - amount;
                balance = newBalance;
                addTransactionRecord(userName, amount, balance, "Success");
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        } else {
            addTransactionRecord(userName, amount, balance, "Insufficient Funds");
            return false;
        }
    }

    public synchronized boolean withdrawSynchronized(int amount, String userName) {
        if (balance >= amount) {
            try {
                Thread.sleep(100); // Simulate processing time
                balance -= amount;
                addTransactionRecord(userName, amount, balance, "Success");
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        } else {
            addTransactionRecord(userName, amount, balance, "Insufficient Funds");
            return false;
        }
    }

    public boolean withdraw(int amount, String userName) {
        return isSynchronized ? withdrawSynchronized(amount, userName) : withdrawUnsynchronized(amount, userName);
    }

    public int getBalance() {
        return balance;
    }
}

class User extends Thread {
    private final BankAccount account;
    private final int withdrawalAmount;

    public User(String name, BankAccount account, int withdrawalAmount) {
        super(name);
        this.account = account;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        account.withdraw(withdrawalAmount, getName());
    }
}

class BankingDemo extends JFrame {
    private final JTextArea logArea;
    private final DefaultTableModel unsyncModel;
    private final DefaultTableModel syncModel;
    private final JLabel unsyncBalance;
    private final JLabel syncBalance;
    
    public BankingDemo() {
        setTitle("Banking Thread Demo - Synchronized vs Unsynchronized");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.WHITE);

        // Initialize components
        logArea = new JTextArea();
        unsyncModel = createTableModel();
        syncModel = createTableModel();
        unsyncBalance = new JLabel("Balance: $1000", SwingConstants.CENTER);
        syncBalance = new JLabel("Balance: $1000", SwingConstants.CENTER);

        initializeUI();
        setLocationRelativeTo(null);
    }

    private DefaultTableModel createTableModel() {
        return new DefaultTableModel(
            new Object[]{"ID", "User", "Amount", "Balance", "Status"},
            0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    private void initializeUI() {
        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Unsynchronized panel
        JPanel unsyncPanel = createDemoPanel("Unsynchronized Operations", unsyncModel, unsyncBalance);
        
        // Synchronized panel
        JPanel syncPanel = createDemoPanel("Synchronized Operations", syncModel, syncBalance);

        mainPanel.add(unsyncPanel);
        mainPanel.add(syncPanel);

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel.setBackground(Color.WHITE);
        
        JButton startButton = createStyledButton("Start Demo");
        startButton.addActionListener(e -> startDemo());
        
        JButton resetButton = createStyledButton("Reset Demo");
        resetButton.addActionListener(e -> resetDemo());

        controlPanel.add(startButton);
        controlPanel.add(resetButton);

        add(controlPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel createDemoPanel(String title, DefaultTableModel model, JLabel balanceLabel) {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            title
        ));

        JTable table = new JTable(model);
        customizeTable(table);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.getViewport().setBackground(Color.WHITE);

        balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));

        panel.add(balanceLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private void customizeTable(JTable table) {
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.setRowHeight(25);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(150, 35));
        button.setBackground(new Color(245, 245, 245));
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        return button;
    }

    private void startDemo() {
        // Create accounts
        BankAccount unsynchronizedAccount = new BankAccount(1000, unsyncModel, false);
        BankAccount synchronizedAccount = new BankAccount(1000, syncModel, true);

        // Create users for each account
        User[] unsyncUsers = {
            new User("User 1", unsynchronizedAccount, 500),
            new User("User 2", unsynchronizedAccount, 500),
            new User("User 3", unsynchronizedAccount, 500)
        };

        User[] syncUsers = {
            new User("User 1", synchronizedAccount, 500),
            new User("User 2", synchronizedAccount, 500),
            new User("User 3", synchronizedAccount, 500)
        };

        // Start threads
        for (User user : unsyncUsers) {
            user.start();
        }
        for (User user : syncUsers) {
            user.start();
        }

        // Monitor thread completion
        new Thread(() -> {
            try {
                for (User user : unsyncUsers) {
                    user.join();
                }
                for (User user : syncUsers) {
                    user.join();
                }
                
                SwingUtilities.invokeLater(() -> {
                    unsyncBalance.setText("Balance: $" + unsynchronizedAccount.getBalance());
                    syncBalance.setText("Balance: $" + synchronizedAccount.getBalance());
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    private void resetDemo() {
        unsyncModel.setRowCount(0);
        syncModel.setRowCount(0);
        unsyncBalance.setText("Balance: $1000");
        syncBalance.setText("Balance: $1000");
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            BankingDemo demo = new BankingDemo();
            demo.setVisible(true);
        });
    }
}