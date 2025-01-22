import java.util.Random;
import java.util.Scanner;

public class RandomIntegersArray {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array index (0-99): ");
            int index = scanner.nextInt();

            if (index < 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Out of Bounds.");
            }

            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}