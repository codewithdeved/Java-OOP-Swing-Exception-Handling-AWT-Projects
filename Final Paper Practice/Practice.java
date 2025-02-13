import javax.swing.*;
import java.awt.*;

public class Practice extends JFrame {

    private JTextField displayField = new JTextField("0");

    private String firstNumber = "";
    private String operator = "";
    private boolean newNumber = true;

    public Practice() {

        setTitle("Calculator");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField.setHorizontalAlignment(JTextField.RIGHT);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttonValues = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String buttonText : buttonValues) {

            JButton button = new JButton(buttonText);

            button.addActionListener(e -> {

                String buttonPressed = e.getActionCommand();

                if (buttonPressed.matches("[0-9]")) {
                    if (newNumber) {
                        displayField.setText(buttonPressed);
                        newNumber = false;
                    } else {
                        displayField.setText(displayField.getText() + buttonPressed);
                    }
                }

                else if (buttonPressed.matches("[/*\\-+]")) {
                    firstNumber = displayField.getText();
                    operator = buttonPressed;
                    newNumber = true;
                }

                else if (buttonPressed.equals("=")) {
                    Double result = calculate(
                            Double.parseDouble(firstNumber),
                            Double.parseDouble(displayField.getText()));
                    displayField.setText(String.valueOf(result));
                    newNumber = true;
                }

                else if (buttonPressed.equals("C")) {
                    displayField.setText("0");
                    firstNumber = "";
                    operator = "";
                }

            });

            buttonPanel.add(button);

        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);

    }

    private double calculate(double firstNum, double secondNum) {
        return switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> secondNum != 0 ? firstNum / secondNum : 0;
            default -> secondNum;
        };
    }

    public static void main(String[] args) {
        new Practice();
    }

}