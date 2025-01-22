import java.util.Scanner;

public class UpdateStudent {
    public static void update() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Roll # To Update: ");

        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student student : CreateStudent.students) {

            if (student.getRollNo() == id) {
                
                System.out.print("Enter New Name: ");
                
                String newName = scanner.nextLine();
                student.setName(newName);
                
                System.out.println("Student Updated Successfully!");
                
                return;

            }

        }

        System.out.println("Student Not Found!");

    }

}