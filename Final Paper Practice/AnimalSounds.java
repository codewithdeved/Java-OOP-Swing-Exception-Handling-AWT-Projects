class Cat {
    public void animalSounds() {
        System.out.println("Meow Meow Meow Meow.");        
    }
}

class Dog extends Cat {
    @Override public void animalSounds() {
        super.animalSounds();
        System.out.println("Bark Bark Bark Bark.");
    }
}

class Mouse extends Dog {
    @Override public void animalSounds() {
        super.animalSounds();
        System.out.println("Pish Pish Pish Pish.");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.animalSounds();
        
        Dog dog = new Dog();
        dog.animalSounds();
        
        Mouse mouse = new Mouse();
        mouse.animalSounds();
    }
}