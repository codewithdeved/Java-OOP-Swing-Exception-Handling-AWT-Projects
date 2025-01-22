// Write a Java program to read a number from the user and print whether it is positive or negative. 

import java.util.Scanner;

public class Positive_Negative_Number {

    public static void main(String[] args) {
    
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
    
        int number = scanner.nextInt();
    
        if (number > 0) {
    
            System.out.println("The number is positive.");
    
        } else if (number < 0) {
    
            System.out.println("The number is negative.");
    
        } else {
    
            System.out.println("The number is zero.");
    
        }
    
    }

}