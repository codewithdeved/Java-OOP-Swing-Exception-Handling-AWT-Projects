public class TextReverse {

    public static void main(String[] args) {

        String text = "Jealousy Kills Confidence.";
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.reverse().toString());
    }
    
}