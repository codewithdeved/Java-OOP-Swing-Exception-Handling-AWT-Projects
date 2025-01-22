import java.util.Scanner;

class Swap {
    int a, b;
    void swapValues(Swap attribute) {
        int temporaryAttribute = attribute.a;
        attribute.a = attribute.b;
        attribute.b = temporaryAttribute;
    }
}

public class SwapAttributes {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Scanner scanner = new Scanner(System.in);
        Swap swap = new Swap();

        System.out.print("Enter first value: ");
        swap.a = scanner.nextInt();
        System.out.print("Enter second value: ");
        swap.b = scanner.nextInt();

        System.out.println("Before swapping: First value = " + swap.a + ", Second value = " + swap.b);

        swap.swapValues(swap);
        System.out.println("After swapping: First value = " + swap.a + ", Second value = " + swap.b);
        scanner.close();
        
    }
}