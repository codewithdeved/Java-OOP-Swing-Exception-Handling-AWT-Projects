import java.util.Scanner;

public class UserNameInput {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.print("Hello, Mr " + name + ".");

        scanner.close();

    }

}