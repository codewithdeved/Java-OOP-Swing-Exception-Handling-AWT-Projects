class Car {
    String make;
    String company;
    int year;
    String color;
    String transmission;

    Car(String make, String company, int year, String color, String transmission) {
        this.make = make;
        this.company = company;
        this.year = year;
        this.color = color;
        this.transmission = transmission;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Company: " + company);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
    }
}

public class Oops {
    public static void main(String args[]) {
        Car car1 = new Car("GLI", "Corolla", 2024, "Black", "auto");
        car1.displayCarInfo();
    }
}