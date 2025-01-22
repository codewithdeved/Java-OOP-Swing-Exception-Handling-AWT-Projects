import java.util.stream.IntStream;

public class SumOfArrayIndexes {

    public static void main(String[] args) {

        System.out.println("Let's Find Out Sum Of Array Integers.");

        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfArrayOfIntegers = IntStream.of(arrayOfIntegers).sum();

        System.out.println("The sum of all the integers inside Array = " + sumOfArrayOfIntegers);

    }
    
}