class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Calculator calc = new Calculator();
        System.out.println("Integer Addition: " + calc.add(10, 20));
        System.out.println("Double Addition: " + calc.add(5.5, 4.5));
        
    }
    
}