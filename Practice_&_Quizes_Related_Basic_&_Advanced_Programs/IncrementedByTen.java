class Increment {
    int value;
    Increment nextIncrement() {
        Increment temp = new Increment();
        temp.value = this.value + 10;
        return temp;
    }
}

public class IncrementedByTen {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Increment obj = new Increment();
        
        obj.value = 5;

        for (int i = 0; i < 5; i++) {
            System.out.print(obj.value + " ");
            obj = obj.nextIncrement();
        }
        
    }
    
}