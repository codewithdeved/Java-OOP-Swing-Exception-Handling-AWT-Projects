import java.util.Scanner;

public class TextPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String word = scanner.nextLine().toLowerCase();

        StringBuffer stringBuffer = new StringBuffer(word);

        String reverseWord = stringBuffer.reverse().toString();

        if (word.equals(reverseWord)) {
            System.out.println("Yes! '"+word+"' '"+reverseWord+"' is a Palindrome.");
        } else {
            System.out.println("No! '"+word+"' '"+reverseWord+"' is not a Palindrome.");
        }
        
    }
    
}