package Inheritance;

class Animals {

    void sound() {
   
        System.out.println("Meow Meow");
   
    }

}

class Cat extends Animals {

    @Override void sound() {
    
        super.sound();
    
        System.out.println("Meow Meow Meow Meow");
    
    }

}

public class AnimalsSound {

    public static void main(String[] args) {

        Cat cat = new Cat();
        
        cat.sound();

    }

}