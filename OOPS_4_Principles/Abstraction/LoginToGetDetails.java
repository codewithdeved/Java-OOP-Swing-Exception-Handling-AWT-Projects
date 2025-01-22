package Abstraction;

import java.util.Scanner;

abstract class StudentRecords {
    abstract void displayStudentRecords();
}

class Tayyab extends StudentRecords {

    private String password = "tayyab123";
    void displayStudentRecords() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        if (enteredPassword.equals(password)) {
            System.out.println("Student Records:");
            System.out.println("Name: Tayyab Ali");
            System.out.println("Age: 20");
            System.out.println("Field: Software Engineering Technology");
        } else {
            System.out.println("Invalid password.");
        }
        scanner.close();
    }
}

public class LoginToGetDetails {

    public static void main(String[] args) {

        Tayyab tayyab = new Tayyab();
        tayyab.displayStudentRecords();

    }
    
}