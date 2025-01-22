import java.util.Scanner;

public class PalindromeTextCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a sentence: ");
        
        String userText = scanner.nextLine();
        
        int userTextLength = userText.length();
        
        System.out.println("The length of the sentence is = " + userTextLength);
        
        char firstChr = userText.charAt(0);
        
        System.out.println("The first chr is = " + firstChr);
        
        char lastChr = userText.charAt(userTextLength - 1);
        
        System.out.println("The last chr is = " + lastChr);
        
        String textToUpper = userText.toUpperCase();
        
        System.out.println(textToUpper);
        
        String textToLower = userText.toLowerCase();
        
        System.out.println(textToLower);
        
        scanner.close();

    }

}
