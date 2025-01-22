class Animal {
    public void sound() { System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() { System.out.println("Dog barks"); }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.sound();
        dog.sound();
        
    }
    
}