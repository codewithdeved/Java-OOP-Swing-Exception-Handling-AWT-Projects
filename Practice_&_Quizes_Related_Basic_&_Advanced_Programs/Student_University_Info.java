// Write a program that creates two classes one is Student another is the
// main method class. student contains private fields of roll-no, semester,
// GPA, and use a constructor and a method to get and show the above
// information of three students using get and show method in java.

class Student {
    
    private int rollNo;
    
    private int semester;
    
    private double GPA;
    
    Student(int rollNo, int semester, double GPA) {
    
        this.rollNo = rollNo;
    
        this.semester = semester;
    
        this.GPA = GPA;
    
    }
    
    void displayStudentData() {
    
        System.out.println("Roll No: " + rollNo);
    
        System.out.println("Semester: " + semester);
    
        System.out.println("GPA: " + GPA);
    
    }

}

public class Student_University_Info {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Student student = new Student(3, 1, 3.45);
        
        student.displayStudentData();
    
    }

}