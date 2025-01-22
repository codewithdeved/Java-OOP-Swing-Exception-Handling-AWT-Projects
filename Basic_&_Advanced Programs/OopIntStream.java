import java.util.Arrays;
import java.util.stream.IntStream;

public class OopIntStream {

    public static void main(String[] args) {

        int[] arryOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenOddNumbers = IntStream.of(arryOfNumbers).filter(n -> n % 2 == 0).toArray();

        System.out.println(Arrays.toString(evenOddNumbers));
        
    }
    
}