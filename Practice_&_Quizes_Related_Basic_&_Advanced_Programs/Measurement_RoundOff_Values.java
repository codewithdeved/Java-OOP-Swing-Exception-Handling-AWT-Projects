// Write a program that creates two classes one is Measurement, and
// another is the main method class. Measurement class contain km,
// meter, millimeter in decimal and a constructor and three methods; first
// method will return the round off kilometer, the second method will
// return the round off meter and third will return the round off millimeter.
// Takes the values and display them.

class Measurement {

    double km, meter, millimeter;

    Measurement(double km, double meter, double millimeter) {
        this.km = km;
        this.meter = meter;
        this.millimeter = millimeter;
    }

    // double roundOff(double value) {
    //     return Math.round(value * 100) / 100.0;
    // }


    double roundOffKilometer() {
        return Math.round(km);
    }

    double roundOffMeter() {
        return Math.round(meter);
    }

    double roundOffMillimeter() {
        return Math.round(millimeter);
    }

    void displayRoundOffValues() {

        System.out.println("Kilometers: " + roundOffKilometer());

        System.out.println("Meters: " + roundOffMeter());

        System.out.println("Millimeters: " + roundOffMillimeter());

    }

}

public class Measurement_RoundOff_Values {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Measurement measurement = new Measurement(2.567, 3.767, 4.897);

        measurement.displayRoundOffValues();

    }

}