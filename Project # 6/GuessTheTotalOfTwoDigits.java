package Projects.GuessTheTotalOfTwoDigits;

import java.util.Scanner;

class GuessingTwoDigits {

    void calculatingTotal() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int previousNumber = firstNumber;
        int currentNumber = secondNumber;
        int total = firstNumber + secondNumber;
        int seventhNumber = 0;

        for (int i = 3; i <= 10; i++) {

            System.out.print("Enter the " + i + "th number (previous: " + previousNumber + " + current: "
                    + currentNumber + "): ");
            int nextNumber = scanner.nextInt();

            if (i == 7) {
                seventhNumber = nextNumber;
            }

            total += nextNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;

        }

        System.out.print("Tell me your seventh number: ");
        int userSeventhNumber = scanner.nextInt();

        if (userSeventhNumber == seventhNumber) {
            System.out.println("Correct! The total of all numbers is: " + total);
        } else {
            System.out.println("Incorrect seventh number. The total of all numbers is: " + total);
        }

        scanner.close();

    }

}

public class GuessTheTotalOfTwoDigits {

    public static void main(String[] args) {
        
        GuessingTwoDigits guessingTwoDigits = new GuessingTwoDigits();
        
        guessingTwoDigits.calculatingTotal();
    
    }

}