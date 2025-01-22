class Car {
    int speed; double regularPrice; String color;
    public Car(int speed, double price, String color) {
        this.speed = speed; this.regularPrice = price; this.color = color;
    }
    public double getSalePrice() { return regularPrice; }
}

class Truck extends Car {
    int weight;
    public Truck(int speed, double price, String color, int weight) {
        super(speed, price, color); this.weight = weight;
    }
    public double getSalePrice() {
        if (weight > 2000) { return regularPrice * 0.9; } 
        else { return regularPrice * 0.8; }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;
    public Ford(int speed, double price, String color, int year, int discount) {
        super(speed, price, color);
        this.year = year; this.manufacturerDiscount = discount;
    }
    public double getSalePrice() { return regularPrice - manufacturerDiscount; }
}

public class CarTruckFord {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Car car = new Car(100, 20000, "Red");
        Truck truck = new Truck(80, 30000, "Blue", 2500);
        Ford ford1 = new Ford(120, 25000, "Black", 2022, 2000);
        Ford ford2 = new Ford(130, 27000, "White", 2023, 3000);

        System.out.println("Car Sale Price: " + car.getSalePrice());
        System.out.println("Truck Sale Price: " + truck.getSalePrice());
        System.out.println("Ford1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford2 Sale Price: " + ford2.getSalePrice());
        
    }
    
}