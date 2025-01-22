import java.util.Scanner;

public class HandleExceptionsInCalculator {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        System.out.println("\nWelcome To The Calculator Made In Java!\n");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Perform calculation? (yes/no): ");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    System.out.print("First number: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Second number: ");
                    int num2 = Integer.parseInt(scanner.nextLine());

                    System.out.print("Operator (+, -, *, /): ");
                    switch (scanner.nextLine()) {
                        case "+" -> System.out.println("Result: " + (num1 + num2));
                        case "-" -> System.out.println("Result: " + (num1 - num2));
                        case "*" -> System.out.println("Result: " + (num1 * num2));
                        case "/" -> System.out.println( num2 != 0 ? "Result: " + (num1 / num2) : "Error: Division by zero.");
                        default -> System.out.println("Invalid operator.");
                    }
                } else {
                    System.out.println("\nThank you for using the calculator.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}