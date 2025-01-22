// 1.Write a Java program that reads a number in inches, converts it to meters.
// Note: One inch is 0.0254 meter.

import java.util.Scanner;

public class Inches_To_Meters {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of inches: ");

        double inches = scanner.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is " + meters + " meters.");

        scanner.close();

    }
    
}