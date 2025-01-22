public class QuizOne {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Fizz Buzz");
                System.out.println();
                System.out.println(i + " is divisible by both 3 and 5.");

            } else if (i % 3 == 0) {

                System.out.println("Fizz");
                System.out.println();
                System.out.println(i + " is divisible by 3 only.");

            } else if (i % 5 == 0) {

                System.out.println("Buzz");
                System.out.println();
                System.out.println(i + " is divisible by 5 only.");

            } else {

                System.out.println();
                System.out.println(i + " is neither divisble by 3 nor 5.");

            }

        }

    }

}