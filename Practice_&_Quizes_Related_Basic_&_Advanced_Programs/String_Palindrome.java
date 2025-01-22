// A PALINDROME is a word which has SAME SPELLING whether it is
// read from Left to Right or from Right to Left. Example: MOM, DAD, DEED,
// PEEP and NOON. Other words which are not PALINDROME are HELLO,
// DOOR and FEET. Write a program that can read a String as user input in
// Capital Letters and then Print YES as Output if the Input is a PALINDROME
// otherwise NO.

import java.util.Scanner;

public class String_Palindrome {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String word = scanner.nextLine().toUpperCase();

        StringBuffer stringBuffer = new StringBuffer(word);

        String reversedWord = stringBuffer.reverse().toString();

        if (word.equals(reversedWord)) {

            System.out.println("YES! Your Typed Word Is Palindrome.");

            System.out.println("Typed Word: " + word);

            System.out.println("Reversed Word: " + reversedWord);

        } else {

            System.out.println("NO! Your Typed Word Is Not A Palindrome.");

            System.out.println("Typed Word: " + word);

            System.out.println("Reversed Word: " + reversedWord);

        }

    }

}