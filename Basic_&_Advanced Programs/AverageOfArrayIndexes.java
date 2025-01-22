import java.util.stream.IntStream;

public class AverageOfArrayIndexes {

    public static void main(String[] args) {

        System.out.println("Let's Find Out Average Of Array Integers.");

        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double averageOfArrayOfIntegers = IntStream.of(arrayOfIntegers).average().orElse(0.0);

        System.out.println("The average of Array elements = " + averageOfArrayOfIntegers);

    }
    
}