import java.util.Scanner;

public class Body_Mass_Index {

    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        double weightInKilograms = weight * 0.45359237;
        System.out.print("Enter your height in feet: ");
        double heightInFeet = scanner.nextDouble();
        double heightInInches = heightInFeet * 12;
        double heightInMeters = heightInInches * 0.0254;
        double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.printf("Your body mass index (BMI) is %.2f\n", bodyMassIndex);
        scanner.close();
    }
    
}