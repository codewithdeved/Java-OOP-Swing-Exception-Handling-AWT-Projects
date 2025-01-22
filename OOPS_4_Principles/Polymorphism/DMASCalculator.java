class ArithematicCalculator {

    int calculator(int num1, int num2) {
        return num1 / num2;
    }

    int calculator(int num1, float num2) {
        return (int) (num1 * num2);
    }

    int calculator(float num1, int num2) {
        return (int) (num1 + num2);
    }

    int calculator(float num1, float num2) {
        return (int) (num1 - num2);
    }

}

public class DMASCalculator {

    public static void main(String[] args) {

        ArithematicCalculator operation = new ArithematicCalculator();

        System.out.println(operation.calculator(10, 20));
        System.out.println(operation.calculator(10, 20f));
        System.out.println(operation.calculator(10f, 20));
        System.out.println(operation.calculator(20f, 10f));

    }

}