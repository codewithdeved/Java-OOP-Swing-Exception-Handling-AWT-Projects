import java.util.Scanner;

class DepositException extends Exception {
    public DepositException(String message) {
        super(message);
    }
}

public class MoneyDepositInBank {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter deposit amount (1000-50000): ");
            int amount = scanner.nextInt();

            if (amount < 1000 || amount > 50000) {
                throw new DepositException("Error: Invalid deposit amount.");
            }

            System.out.println("Money has been deposited successfully.");
        } catch (DepositException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}