// Write a program that create two classes one is Power_law another is
// the main method class. Power_law class contains current, voltage and
// power fields in integer datatype, and a method to calculate power and
// display the output.

class Power_Law {
    
    int current,
            voltage,
            power;
    
            Power_Law(int current, int voltage) {
        this.current = current;
        this.voltage = voltage;
    }
    void calculatePower() {
        power = current * voltage;
        System.out.println("Power = " + power + " watts");
    }

}

public class Power_Law_Calculate {
    public static void main(String[] args) {
    
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Power_Law powerLaw = new Power_Law(5, 12);
    
        powerLaw.calculatePower();
    
    }
}