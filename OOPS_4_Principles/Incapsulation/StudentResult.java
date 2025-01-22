package Incapsulation;

import java.util.Scanner;

class StudentRollNo {
    
    private int rollNo;
    String name = "Tayyab Ali";

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    int getRollNo() {
        return rollNo;
    }

    public void studentResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your roll no: ");
        int inputRollNo = scanner.nextInt();
        setRollNo(inputRollNo);
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Name: " + name);
        System.out.println("Result: Pass");
    }
}

public class StudentResult {

    public static void main(String[] args) {
        StudentRollNo student = new StudentRollNo();
        student.studentResult();
    }
    
}