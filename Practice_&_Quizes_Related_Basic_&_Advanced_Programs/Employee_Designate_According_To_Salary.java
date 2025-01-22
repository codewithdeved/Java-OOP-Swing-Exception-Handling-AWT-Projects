// Write a program to read salary of an employee and designate
// according to their salary using if-else ladder.
// Note: 25k-35k Research Assistant
//  36k-50k Junior Lecturer
//  51k-65k Lecturer
//  66k-80k Assistant Professor

import java.util.Scanner;

public class Employee_Designate_According_To_Salary {

    public static void main(String[] args) {
    
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Please enter your salary: ");
    
        int salary = scanner.nextInt();
    
        if (salary >= 25000 && salary <= 35000) {
    
            System.out.println("We are delighted to officially designate you as the Research Assistant at Devidians Tech.");
    
        } else if (salary >= 36000 && salary <= 50000) {
    
            System.out.println("We are delighted to officially designate you as the Junior Lecturer at Devidians Tech.");
    
        } else if (salary >= 51000 && salary <= 65000) {
    
            System.out.println("We are delighted to officially designate you as the Senior Lecturer at Devidians Tech.");
    
        } else {
    
            System.out.println("We are delighted to officially designate you as the Assistant Professor at Devidians Tech.");
    
        }
    
    }

}