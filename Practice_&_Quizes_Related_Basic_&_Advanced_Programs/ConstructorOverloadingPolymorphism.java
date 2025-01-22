class Example {
    Example() {
        System.out.println("Default Constructor");
    }
    Example(int a) {
        System.out.println("Constructor with one argument: " + a);
    }
    Example(int a, int b) {
        System.out.println("Constructor with two arguments: " + a + ", " + b);
    }
}

public class ConstructorOverloadingPolymorphism {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Example obj1 = new Example();
        Example obj2 = new Example(10);
        Example obj3 = new Example(20, 30);
        
    }
    
}