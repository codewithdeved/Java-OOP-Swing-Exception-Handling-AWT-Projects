public class TextInitialCapital {

    public static void main(String[] args) {

        String text = "hello world!";
    
        char textInitial = text.charAt(0);
        char textInitialToUpper = Character.toUpperCase(textInitial);
        System.out.println("First Initial Capitalized: " + textInitialToUpper);

        String textReplace = text.replace("world", "deved");
        System.out.println("Text replaced from " + text + " to " + textReplace);

        String textTrim = " hello world! ";
        System.out.println(textTrim.trim());

        int countWords = text.split("\\s").length;
        System.out.println("Total Word: " + countWords);
    
    }

}