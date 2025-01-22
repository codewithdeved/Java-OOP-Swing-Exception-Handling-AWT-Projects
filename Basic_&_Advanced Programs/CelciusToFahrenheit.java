import java.util.Scanner;

public class CelciusToFahrenheit {

    public static void main(String[] args) {

        System.out.println("Let's Calculate Celcius To Fahrenheit.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the celcius rate to convert to fahrenheit: ");

        int celcius = scanner.nextInt();

        int fahrenheit = ( 9 / 5 * celcius) + 32;

        System.out.println("The conversion of " + celcius + "\u00B0C to Fahrenheit = " + fahrenheit + "\u00B0F");

        scanner.close();

    }
    
}
