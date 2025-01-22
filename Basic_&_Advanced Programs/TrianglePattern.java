public class TrianglePattern {

    public static void main(String[] args) {

        System.out.println("Let's Create a Triangle Pattern.");

        for (int i = 1; i <= 10; i++) {

            for (int k = 1; k <= 10 - i; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}