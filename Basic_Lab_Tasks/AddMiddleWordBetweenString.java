import java.util.Scanner;

public class AddMiddleWordBetweenString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        
        String text = scanner.nextLine();
        
        StringBuffer stringBuffer = new StringBuffer(text);
        
        System.out.print("Type a middle word: ");
        
        String enterWord = scanner.nextLine();
        
        int middleWord = stringBuffer.length() / 2;
        
        stringBuffer.insert(middleWord, enterWord + " ");
        
        System.out.println(stringBuffer);

        scanner.close();

    }
    
}