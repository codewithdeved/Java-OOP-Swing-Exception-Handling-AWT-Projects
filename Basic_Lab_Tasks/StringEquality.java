public class StringEquality {

    public static void main(String[] args) {

        String string1 = "Tayyab";
        
        String string2 = "Ahsan";

        boolean stringEquality = string1.equalsIgnoreCase(string2);

        System.out.println(stringEquality);

        int stringCompare = string1.compareTo(string2);

        if (stringCompare == 0) {
        
            System.out.println("The strings are lexicographically equal.");
        
        } else if (stringCompare < 0) {
        
            System.out.println("The string '" + string1 + "' comes before '" + string2 + "' lexicographically.");
        
        } else {
        
            System.out.println("The string '" + string1 + "' comes after '" + string2 + "' lexicographically.");
        
        }

    }

}
