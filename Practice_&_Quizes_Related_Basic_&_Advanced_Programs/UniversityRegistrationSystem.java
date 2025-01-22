class Student {
    String name, rollNumber, address;
    double gpa;

    Student(String name, String rollNumber, String address, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.gpa = gpa;
    }
}

class Teacher {
    String name, phoneNumber, degree;

    Teacher(String name, String phoneNumber, String degree) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.degree = degree;
    }
}

class Course {
    String courseName;
    Student[] students = new Student[5];
    Teacher teacher;

    void printDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher.name + " (" + teacher.degree + ")");
        System.out.println("Registered Students:");
        for (Student s : students) {
            if (s != null) {
                System.out.println("Name: " + s.name + ", Roll Number: " + s.rollNumber);
            }
        }
    }
}

public class UniversityRegistrationSystem {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Student student1 = new Student("Tayyab Ali", "2024S-BSET-003", "Street Block 1", 3.45);
        Student student2 = new Student("Hamza", "2024S-BSET-008", "Street Block 2", 2.9);
        Student student3 = new Student("Wasay", "2024S-BSET-021", "Street Block 3", 2.5);
        Student student4 = new Student("Zain", "2024S-BSET-005", "Street Block 4", 3);
        Student student5 = new Student("Raj", "2024S-BSET-016", "Street Block 5", 1.5);

        Teacher teacher = new Teacher("Sir Sharukh Haider", "+92 335 1266508", "Masters in Software Engineering");

        Course course = new Course();
        course.courseName = "Object Oriented Programming";
        course.teacher = teacher;
        course.students[0] = student1;
        course.students[1] = student2;
        course.students[2] = student3;
        course.students[3] = student4;
        course.students[4] = student5;

        course.printDetails();
    }
}