import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class Calculator extends Frame implements ActionListener {

    TextField resultField;

    public Calculator() {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

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
        for (String label : buttonLabels) {
            Button btn = new Button(label);
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
            if ((x - 20) % 280 == 0) {
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
        } else if (command.equals("=")) {
            try {
                String expression = resultField.getText().trim();
                if (!expression.isEmpty()) {
                    double evalResult = evaluateExpression(expression);
                    resultField.setText(String.valueOf(evalResult));
                    resultField.setBackground(Color.GREEN);
                    resultField.setForeground(Color.BLACK);
                }
            } catch (Exception ex) {
                resultField.setText("Error");
                resultField.setBackground(Color.RED);
                resultField.setForeground(Color.WHITE);
            }
        } else {
            resultField.setText(resultField.getText() + command);
            resultField.setBackground(Color.BLACK);
            resultField.setForeground(Color.WHITE);
        }
    }

    private double evaluateExpression(String expression) {
        return evaluatePostfix(infixToPostfix(expression));
    }

    private String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                result.append(c);
            } else {
                result.append(' ');
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(' ').append(stack.pop());
        }
        return result.toString();
    }

    private double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        for (String token : postfix.split("\\s+")) {
            if (token.isEmpty()) continue;
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }

    private int precedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        new Calculator();
    }

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