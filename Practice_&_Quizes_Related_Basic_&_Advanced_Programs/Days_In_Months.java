// 2.Write a Java program to convert days into number of months and days

import java.util.Scanner;

public class Days_In_Months {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");

        int days = scanner.nextInt();

        int numOfMonth = days / 30;

        int remainingDays = days % 30;

        System.out.println(days + " days = " + numOfMonth + (numOfMonth > 1 ? " months " : " month ")
                + (remainingDays > 0 ? "and " : "") + (remainingDays > 0 ? remainingDays : "") +
                (remainingDays > 0 ? (remainingDays > 1 ? " days " : " day ") : ""));

        scanner.close();

    }

}