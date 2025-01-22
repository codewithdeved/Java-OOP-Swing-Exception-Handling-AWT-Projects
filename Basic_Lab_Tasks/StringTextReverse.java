import java.util.Scanner;

public class StringTextReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        
        String text = scanner.nextLine();
        
        StringBuffer textReverse = new StringBuffer(text);
        
        textReverse.reverse();
        
        System.out.println(textReverse);

    }
    
}