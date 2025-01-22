class Time {
    int hours, minutes, seconds;
    void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeForTwoLocations {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Time time1 = new Time();
        Time time2 = new Time();

        time1.hours = 3; time1.minutes = 30; time1.seconds = 5;
        time2.hours = 4; time2.minutes = 45; time2.seconds = 15;

        System.out.print("Time1: ");
        time1.display();
        System.out.print("Time2: ");
        time2.display();
        
    }
    
}