import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CinemaHall {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new AgeException("Not eligible to enter the cinema hall.");
            }

            System.out.println("Welcome to the cinema hall!");
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
    
}