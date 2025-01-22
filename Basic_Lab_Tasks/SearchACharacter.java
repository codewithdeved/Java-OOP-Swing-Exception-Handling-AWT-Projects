import java.util.Scanner;

public class SearchACharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Search a character; ");

        char search = scanner.next().charAt(0);

        String text = "This is a hello world text!";

        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
        
            if (text.charAt(i) == search) {
            
                wordCount++;
            
            }
        
        }

        System.out.println("The character '" + search + "' appeared " + wordCount + " times.");

    }

}
