// Write a program to read 3 integer values and print the greater and lesser number respectively.

import java.util.Scanner;

public class Greater_Lesser_Number {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is = " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is = " + num2);
        } else {
            System.out.println("The greatest number is = " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("The lesser number is = " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("The lesser number is = " + num2);
        } else {
            System.out.println("The lesser number is = " + num3);
        }

    }

}