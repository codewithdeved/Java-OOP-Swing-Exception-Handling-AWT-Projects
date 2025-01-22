// Write a program to wander around 10 different locations and find
// their average temperature of a year, you’ll generate the temperatures
// as random values between -10 degrees and 35 degrees. This assumes
// you are recording temperatures in degrees Celsius. If you prefer
// Fahrenheit, you could generate values from 14 degrees to 95 degrees
// to cover the same range.
// Expected Output:
// Average temperature at location 1 = 12.2733345
// Average temperature at location 2 = 12.012519
// Average temperature at location 3 = 11.545245…continue till location 10.

import java.util.Random;

public class Locations_Temperatures {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        String[] locations = {
                "Bermuda Triangle", "Easter Island", "Devil's Sea", "Door to Hell",
                "Mount Roraima", "Nazca Lines", "Stonehenge", "Moeraki Boulders",
                "Catacombs of Paris", "Aokigahara Forest"
        };

        Random random = new Random();

        for (String location : locations) {
            int temperatureInCelsius = 14 + random.nextInt(50);
            System.out.println("In today's news: Temperature at " + location + " has been recorded at "
                    + temperatureInCelsius + " degrees Celsius.");

        }

    }

}