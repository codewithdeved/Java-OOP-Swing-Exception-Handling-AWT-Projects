import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. Roll #: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
        
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> CreateStudent.add();
                case 2 -> ReadStudent.view();
                case 3 -> UpdateStudent.update();
                case 4 -> DeleteStudent.delete();
                default -> System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 0);
        
        scanner.close();
    }
}