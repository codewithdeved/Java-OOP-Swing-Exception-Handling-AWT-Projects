import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Welcome To The Calculator Made In Java!");

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Do you want to perform a calculation? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {

                System.out.println();

                System.out.println("Enter your first number: ");
                int firstNumber = scanner.nextInt();

                System.out.println();

                System.out.println("Enter your second number: ");
                int secondNumber = scanner.nextInt();

                System.out.println();

                System.out.println("Enter your operator (+, -, *, /): ");
                String operator = scanner.next();

                System.out.println();

                if (operator.equals("+")) {

                    System.out.println("Addition: " + (firstNumber + secondNumber));

                    System.out.println();

                } else if (operator.equals("-")) {
                    System.out.println("Subtraction: " + (firstNumber - secondNumber));

                    System.out.println();

                } else if (operator.equals("*")) {
                    System.out.println("Multiplication: " + (firstNumber * secondNumber));

                    System.out.println();

                } else if (operator.equals("/")) {

                    if (secondNumber != 0) {
                        System.out.println("Division: " + (firstNumber / secondNumber));
                        System.out.println();
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        System.out.println();
                    }

                } else {
                    System.out.println("Invalid operator entered.");
                    System.out.println();
                }

                scanner.nextLine();

            } else if (choice.equalsIgnoreCase("no")) {

                System.out.println();
                System.out.println("Thank you for using the calculator.");
                break;

            } else {
                System.out.println();
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }

        }

        scanner.close();

    }

}