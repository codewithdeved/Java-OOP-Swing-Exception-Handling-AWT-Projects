package DoWhileLoopAndEnum;

import java.util.Scanner;

public class TaskNoTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number here: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number here: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter an operation to perform (Addition, Subtraction, Multiplication, Division): ");
        String operation = scanner.next().toLowerCase();

        int result = 0;

        switch (operation) {

            case "addition":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case "subtraction":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case "multiplication":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case "division":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out
                        .println("Invalid operation. Please enter Addition, Subtraction, Multiplication, or Division.");
                break;
        }

        scanner.close();
    }

}