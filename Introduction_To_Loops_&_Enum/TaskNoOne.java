package DoWhileLoopAndEnum;

import java.util.Scanner;

public class TaskNoOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10) + 1;

        boolean isRunning = false;

        System.out.println(randomNumber);

        do {

            System.out.print("Entre a number here: ");

            int number = scanner.nextInt();

            if (number == randomNumber) {
            
                isRunning = true;
            
                System.out.println("Correct!");
            
            } else {
            
                isRunning = false;
            
                System.out.println("Not Correct!");
            
            }

        } while (isRunning = true);

    }

}