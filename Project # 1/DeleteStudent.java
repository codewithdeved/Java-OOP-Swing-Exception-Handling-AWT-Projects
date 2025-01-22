import java.util.Scanner;

public class DeleteStudent {
    public static void delete() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Roll # To Delete: ");
        int rollNo = scanner.nextInt();

        for (Student student : CreateStudent.students) {

            if (student.getRollNo() == rollNo) {

                CreateStudent.students.remove(student);
                System.out.println("Student Deleted Successfully!");

                return;

            }

        }

        System.out.println("Student Not Found!");

    }

}