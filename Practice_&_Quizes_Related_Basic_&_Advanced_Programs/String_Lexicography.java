// Write a java program to compare any two strings lexicographically and to
// get the character at the 3 and 4 index within the String.
// Sample Output:
// String 1: This is Exercise 1
// String 2: This is Exercise 2
// "This is Exercise 1" is less than "This is Exercise 2"
// The character at position 0 is T
// The character at position 4 is s

public class String_Lexicography {

    public static void main(String[] args) {
    
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        String string1 = "This is Exercise 1";
    
        String string2 = "This is Exercise 2";
    
        int stringCompare = string1.compareTo(string2);
    
        if (stringCompare == 0) {
    
            System.out.println("The strings are lexicographically equal.");
    
        } else if (stringCompare < 0) {
    
            System.out.println("'"+ string1 + "' is less than '" + string2 + "' lexicographically.");
    
            System.out.println("The character at position 0 in '" + string1 + "' is " + string1.charAt(0));
    
            System.out.println("The character at position 4 in '" + string1 + "' is " + string1.charAt(3));
    
        } else {
    
            System.out.println("'"+ string1 + "' is greater than '" + string2 + "' lexicographically.");
    
            System.out.println("The character at position 0 in '" + string1 + "' is " + string1.charAt(0));
    
            System.out.println("The character at position 4 in '" + string1 + "' is " + string1.charAt(3));
    
        }

    }
    
}