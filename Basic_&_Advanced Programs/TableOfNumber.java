import java.util.Scanner;

public class TableOfNumber {

    public static void main(String[] args) {

        System.out.println("Let's Print The Table Of Number.");

        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = number.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }
    
}