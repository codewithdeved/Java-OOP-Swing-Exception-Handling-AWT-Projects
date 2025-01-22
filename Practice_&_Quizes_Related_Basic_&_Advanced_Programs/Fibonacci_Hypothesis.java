// Write a program to generate Fibonacci hypothesis for 19 generations
// given below.
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
// 6765 

public class Fibonacci_Hypothesis {

    public static void main(String[] args) {
    
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");
    
        int[] generationsAndFirstAndSecondNumber = {19, 0, 1};
    
        System.out.print(generationsAndFirstAndSecondNumber[1] + " ");
    
        for (int i = 0; i < generationsAndFirstAndSecondNumber[0]; i++) {
    
            int nextNumber = generationsAndFirstAndSecondNumber[1] + generationsAndFirstAndSecondNumber[2];
    
            System.out.print(nextNumber + " ");
    
            generationsAndFirstAndSecondNumber[1] = generationsAndFirstAndSecondNumber[2];
    
            generationsAndFirstAndSecondNumber[2] = nextNumber;
    
        }
    
    }
    
}