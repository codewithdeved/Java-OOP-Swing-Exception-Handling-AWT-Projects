// Write a program that extracts username & domain information from Email
// address.
// Example:
// if the email address is "user@my.com", your program will print
// User name = user
// Domain = my
// Extension = com

import java.util.Scanner;

public class Domain_Extract {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");

        String email = scanner.nextLine();

        scanner.close();

        int atSymbolIndex = email.indexOf('@'),

                dotIndex = email.indexOf('.', atSymbolIndex);

        if (email.contains("@") && dotIndex > atSymbolIndex) {

            System.out.println("User name = " + email.substring(0, atSymbolIndex));

            System.out.println("Domain = " + email.substring(atSymbolIndex + 1, dotIndex));

            System.out.println("Extension = " + email.substring(dotIndex + 1));

        } else {

            System.out.println("Invalid email format.");

        }
    }

}