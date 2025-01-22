// 1. Write a program to solve quadratic equation using( if, else-if and else)

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");

        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");

        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");

        double c = scanner.nextDouble();

        double BSquareMinus4AC = b * b - 4 * a * c;

        if (BSquareMinus4AC > 0) {

            double root1 = (-b + Math.sqrt(BSquareMinus4AC)) / (2 * a);

            double root2 = (-b - Math.sqrt(BSquareMinus4AC)) / (2 * a);

            System.out.println("The roots are: " + root1 + " and " + root2);

        } else if (BSquareMinus4AC == 0) {

            double root = -b / (2 * a);

            System.out.println("The root is: " + root);

        } else {

            System.out.println("The equation has no real roots.");

        }

    }

}