import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String course;
    private String studentId;

    public Student(String name, int age, String course, String studentId) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentId = studentId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
}

class StudentManagementSystem extends JFrame {
    private ArrayList<Student> students = new ArrayList<>();
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameField, ageField, courseField, idField;
    private JButton addButton, editButton, deleteButton, clearButton;
    private boolean isEditing = false;
    private static final Color BACKGROUND_COLOR = Color.WHITE;
    private static final Color TEXT_COLOR = Color.BLACK;
    private static final Color BUTTON_COLOR = new Color(245, 245, 245);
    private static final Color BUTTON_HOVER_COLOR = new Color(230, 230, 230);

    public StudentManagementSystem() {
        setTitle("Student Management System");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(BACKGROUND_COLOR);

        initializeComponents();
        setupTable();
        setupActionButtons();
        setupTableListener();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBackground(BACKGROUND_COLOR);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBackground(BACKGROUND_COLOR);
        inputPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            "Student Information"
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        nameField = createStyledTextField();
        ageField = createStyledTextField();
        courseField = createStyledTextField();
        idField = createStyledTextField();

        JLabel[] labels = {
            createStyledLabel("Name:"),
            createStyledLabel("Age:"),
            createStyledLabel("Course:"),
            createStyledLabel("Student ID:")
        };

        JTextField[] fields = {nameField, ageField, courseField, idField};
        
        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0; gbc.gridy = i; gbc.weightx = 0.1;
            inputPanel.add(labels[i], gbc);
            gbc.gridx = 1; gbc.weightx = 0.9;
            inputPanel.add(fields[i], gbc);
        }

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(TEXT_COLOR);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        return label;
    }

    private JTextField createStyledTextField() {
        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(200, 30));
        field.setFont(new Font("Arial", Font.PLAIN, 14));
        field.setBackground(BACKGROUND_COLOR);
        field.setForeground(TEXT_COLOR);
        field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        return field;
    }

    private void setupTable() {
        String[] columns = {"Name", "Age", "Course", "Student ID"};
        model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setShowGrid(true);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setBackground(BACKGROUND_COLOR);
        table.setForeground(TEXT_COLOR);
        table.getTableHeader().setBackground(BUTTON_COLOR);
        table.getTableHeader().setForeground(TEXT_COLOR);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            "Student List"
        ));
        scrollPane.getViewport().setBackground(BACKGROUND_COLOR);
        
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(BACKGROUND_COLOR);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        tablePanel.add(scrollPane);
        
        add(tablePanel, BorderLayout.SOUTH);
    }

    private void setupActionButtons() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(BACKGROUND_COLOR);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        addButton = createStyledButton("Add Student");
        editButton = createStyledButton("Edit Student");
        deleteButton = createStyledButton("Delete Student");
        clearButton = createStyledButton("Clear Fields");

        addButton.addActionListener(e -> addStudent());
        editButton.addActionListener(e -> editStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        clearButton.addActionListener(e -> clearFields());

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        JPanel mainPanel = (JPanel) getContentPane().getComponent(0);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(120, 35));
        button.setBackground(BUTTON_COLOR);
        button.setForeground(TEXT_COLOR);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(BUTTON_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(BUTTON_COLOR);
            }
        });

        return button;
    }

    private void setupTableListener() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    nameField.setText(model.getValueAt(selectedRow, 0).toString());
                    ageField.setText(model.getValueAt(selectedRow, 1).toString());
                    courseField.setText(model.getValueAt(selectedRow, 2).toString());
                    idField.setText(model.getValueAt(selectedRow, 3).toString());
                    idField.setEnabled(false);
                    addButton.setEnabled(false);
                    editButton.setEnabled(true);
                    isEditing = true;
                }
            }
        });
    }

    private void addStudent() {
        try {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String course = courseField.getText().trim();
            String studentId = idField.getText().trim();

            if (name.isEmpty() || ageText.isEmpty() || course.isEmpty() || studentId.isEmpty()) {
                showWarning("Please fill all fields");
                return;
            }

            int age = Integer.parseInt(ageText);
            if (age <= 0 || age > 120) {
                showWarning("Please enter a valid age (1-120)");
                return;
            }

            if (isDuplicateId(studentId)) {
                showWarning("Student ID already exists");
                return;
            }

            Student student = new Student(name, age, course, studentId);
            students.add(student);
            model.addRow(new Object[]{name, age, course, studentId});
            clearFields();
            showSuccess("Student added successfully");
        } catch (NumberFormatException ex) {
            showWarning("Please enter a valid age");
        }
    }

    private void editStudent() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            showWarning("Please select a student to edit");
            return;
        }

        try {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String course = courseField.getText().trim();
            String studentId = idField.getText().trim();

            if (name.isEmpty() || ageText.isEmpty() || course.isEmpty() || studentId.isEmpty()) {
                showWarning("Please fill all fields");
                return;
            }

            int age = Integer.parseInt(ageText);
            if (age <= 0 || age > 120) {
                showWarning("Please enter a valid age (1-120)");
                return;
            }

            Student student = students.get(selectedRow);
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);

            model.setValueAt(name, selectedRow, 0);
            model.setValueAt(age, selectedRow, 1);
            model.setValueAt(course, selectedRow, 2);

            clearFields();
            showSuccess("Student updated successfully");
        } catch (NumberFormatException ex) {
            showWarning("Please enter a valid age");
        }
    }

    private void deleteStudent() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            showWarning("Please select a student to delete");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to delete this student?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            students.remove(selectedRow);
            model.removeRow(selectedRow);
            clearFields();
            showSuccess("Student deleted successfully");
        }
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
        courseField.setText("");
        idField.setText("");
        idField.setEnabled(true);
        addButton.setEnabled(true);
        editButton.setEnabled(false);
        isEditing = false;
        table.clearSelection();
    }

    private boolean isDuplicateId(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    private void showWarning(String message) {
        JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("Panel.background", BACKGROUND_COLOR);
            UIManager.put("OptionPane.background", BACKGROUND_COLOR);
            UIManager.put("OptionPane.messageForeground", TEXT_COLOR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> new StudentManagementSystem());
    }
}