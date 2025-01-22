package Projects.GuessFamilyMembersLength;

import java.util.Scanner;

class GuessingFamilyMembersLength {

    private int familyMembers = 0;

    void performingOperations() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many male members are there in your Family? ");
        int inputMaleMembers = scanner.nextInt();

        System.out.print("How many female members are there in your Family? ");
        int inputFemaleMembers = scanner.nextInt();

        int adjustedMaleMembers = inputMaleMembers + 3;
        int multipliedResult = adjustedMaleMembers * 5;
        int addedResult = multipliedResult + 20;
        int doubledResult = addedResult * 2;
        int finalResult = doubledResult + inputFemaleMembers - 70;

        familyMembers = sumOfDigits(finalResult);

        System.out.println("There are total " + familyMembers + " members in your Family.");

        scanner.close();

    }

    private int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

public class GuessFamilyMembersLength {

    public static void main(String[] args) {

        GuessingFamilyMembersLength guessingFamilyMembersLength = new GuessingFamilyMembersLength();
        guessingFamilyMembersLength.performingOperations();

    }
}