public class ReadStudent {
    public static void view() {

        if (CreateStudent.students.isEmpty()) {

            System.out.println("No Students Found.");

        } else {

            System.out.println("Student List:");

            for (Student student : CreateStudent.students) {
                System.out.println("Roll #: " + student.getRollNo() + "\nName: " + student.getName());
            }

        }

    }

}