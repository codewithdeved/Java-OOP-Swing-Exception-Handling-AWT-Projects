public class DiamondPattern {

    public static void main(String[] args) {

        System.out.println("Let's Create a Diamond Pattern.");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int l = 9; l >= 1; l--) {

            for (int m = 1; m <= 10 - l; m++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= 2 * l - 1; n++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}