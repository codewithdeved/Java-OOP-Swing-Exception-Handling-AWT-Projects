import java.util.Scanner;

public class StringBuilderTextReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a word");
        
        String text = scanner.nextLine();
        
        StringBuilder textReverse = new StringBuilder(text).reverse();
        
        System.out.println(textReverse);
        
        System.out.println(text.equalsIgnoreCase(textReverse.toString()));

    }

}