import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter test score (0-100): ");
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score out of range.");
            }

            String grade;
            if (score >= 90)
                grade = "A";
            else if (score >= 80)
                grade = "B";
            else if (score >= 70)
                grade = "C";
            else if (score >= 60)
                grade = "D";
            else
                grade = "F";
            System.out.println("Grade: " + grade);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}