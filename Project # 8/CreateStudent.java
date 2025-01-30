import java.util.ArrayList;
import java.util.Scanner;

public class CreateStudent {

    static ArrayList<Student> students = new ArrayList<>();

    public static void add() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Roll #: ");

        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        students.add(new Student(rollNo, name));
        System.out.println("Student Added Successfully!");

    }

}