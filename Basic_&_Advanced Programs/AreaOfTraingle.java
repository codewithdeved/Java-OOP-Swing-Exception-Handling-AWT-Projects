import java.util.Scanner;

public class AreaOfTraingle {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Let's Calculate Area Of Triangle.");

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter the height of Triangle: ");

        int height = scanner.nextInt();

        System.out.println();

        System.out.println("Enter the base of Triangle: ");

        int base = scanner.nextInt();

        double area = (0.5) * height * base;

        System.out.println();

        System.out.println("The area of the triangle = " + area + " cm\00B2");

        scanner.close();

    }

}
