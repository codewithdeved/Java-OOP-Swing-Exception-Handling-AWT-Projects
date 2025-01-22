package Inheritance;

class Vehicle {
    void start() {};
    void drive() {};
    void stop() {};
}

class Bugatti extends Vehicle {
    @Override
    void start() {
        System.out.println("Engine Start.");
    }
}

class Drive extends Bugatti {
    @Override
    void drive() {
        super.start();
        System.out.println("Driving at 1000 km per hour.");
    }
}

class Park extends Drive {
    @Override
    void stop() {
        super.drive();
        System.out.println("Engine Stop.");
    }
}

public class VehicleMove {

    public static void main(String[] args) {
        Bugatti bugatti = new Park();
        bugatti.stop();
    }

}