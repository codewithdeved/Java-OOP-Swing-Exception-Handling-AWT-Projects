class Processor {
    String brand; int cores; double speed;
    Processor(String brand, int cores, double speed) {
        this.brand = brand; this.cores = cores; this.speed = speed;
    }
}

class Computer {
    String name; Processor processor;
    Computer(String name, Processor processor) { this.name = name; this.processor = processor; }
    void printDetails() {
        System.out.println(name + " Processor:"); System.out.println("Brand: " + processor.brand);
        System.out.println("Cores: " + processor.cores); System.out.println("Speed: " + processor.speed + " GHz");
    }
    static void compareProcessors(Computer c1, Computer c2) {
        System.out.println("\nDifferences Between Processors:");
        if (!c1.processor.brand.equals(c2.processor.brand)) { System.out.println("Brand: " + c1.processor.brand + " vs " + c2.processor.brand); }
        if (c1.processor.cores != c2.processor.cores) { System.out.println("Cores: " + c1.processor.cores + " vs " + c2.processor.cores); }
        if (c1.processor.speed != c2.processor.speed) { System.out.println("Speed: " + c1.processor.speed + " GHz vs " + c2.processor.speed + " GHz"); }
    }
}

class MyComputer extends Computer {
    MyComputer() { super("MyComputer", new Processor("Intel", 4, 3.0)); }
}

class YourComputer extends Computer {
    YourComputer() { super("YourComputer", new Processor("AMD", 6, 3.5)); }
}

public class ComputerComparison {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        MyComputer myComputer = new MyComputer(); YourComputer yourComputer = new YourComputer();
        myComputer.printDetails(); yourComputer.printDetails();
        Computer.compareProcessors(myComputer, yourComputer);
    }
}