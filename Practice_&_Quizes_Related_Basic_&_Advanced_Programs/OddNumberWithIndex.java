import java.util.Scanner;

class ArrayOperations {
    
    private int[] array;

    public ArrayOperations(int[] array) {
        this.array = array.clone();
    }

    public void displayOddNumbers() {
        System.out.println("Odd numbers with their indices:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " found at index = " + i);
            }
        }
    }

    public void displayOriginalArray() {
        System.out.print("Original Array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}

public class OddNumberWithIndex {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayOperations operations = new ArrayOperations(array);
        operations.displayOddNumbers();
        operations.displayOriginalArray();
    }
}