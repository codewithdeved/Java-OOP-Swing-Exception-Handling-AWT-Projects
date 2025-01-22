import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    TextField resultField;
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    public Calculator() {

        setTitle("Calculator");

        setSize(320, 430);
        setLayout(null);
        setResizable(false);

        setBackground(Color.WHITE);

        resultField = new CustomTextField();
        resultField.setFont(new Font("Arial", Font.BOLD, 24));
        resultField.setBackground(Color.BLACK);
        resultField.setForeground(Color.WHITE);
        resultField.setEditable(false);
        resultField.setBounds(20, 50, 275, 55);

        add(resultField);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        int x = 20, y = 120;

        for (int i = 0; i < buttonLabels.length; i++) {

            Button btn = new Button(buttonLabels[i]);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.setBounds(x, y, 65, 65);
            btn.setBackground(Color.BLACK);
            btn.setForeground(Color.WHITE);
            btn.addActionListener(this);

            btn.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    btn.setBackground(Color.DARK_GRAY);
                }

                public void mouseReleased(MouseEvent e) {
                    btn.setBackground(Color.BLACK);
                }
            });

            add(btn);

            x += 70;
            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 70;
            }

        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("C")) {

            resultField.setText("");
            resultField.setBackground(Color.BLACK);
            resultField.setForeground(Color.WHITE);
            num1 = num2 = result = 0;
            operator = "";

        } else if (command.equals("=")) {

            if (!operator.isEmpty() && resultField.getText().contains(operator)) {

                String[] operands = resultField.getText().split("\\" + operator);

                if (operands.length == 2) {

                    try {

                        num2 = Double.parseDouble(operands[1]);

                        switch (operator) {
                            case "+" -> result = num1 + num2;
                            case "-" -> result = num1 - num2;
                            case "*" -> result = num1 * num2;
                            case "/" -> result = num2 != 0 ? num1 / num2 : Double.NaN;
                        }

                        resultField.setText(String.valueOf(result));
                        resultField.setBackground(Color.GREEN);
                        resultField.setForeground(Color.BLACK);
                        operator = "";

                    } catch (NumberFormatException ex) {
                        resultField.setText("Error");
                    }

                }

            }

        } else if ("+-*/".contains(command)) {

            if (!resultField.getText().isEmpty() && operator.isEmpty()) {

                try {

                    num1 = Double.parseDouble(resultField.getText());
                    operator = command;
                    resultField.setText(resultField.getText() + operator);

                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }

            }

        } else {

            resultField.setText(resultField.getText() + command);
            resultField.setBackground(Color.BLACK);
            resultField.setForeground(Color.WHITE);

        }

    }

    public static void main(String[] args) {
        new Calculator();
    }

    // Custom TextField with vertical padding
    class CustomTextField extends TextField {

        @Override
        public void paint(Graphics g) {

            g.setFont(getFont());
            FontMetrics fm = g.getFontMetrics();
            int textHeight = fm.getHeight();
            int y = (getHeight() + textHeight) / 2 - fm.getDescent();
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(getForeground());
            g.drawString(getText(), 5, y);

        }

    }

}