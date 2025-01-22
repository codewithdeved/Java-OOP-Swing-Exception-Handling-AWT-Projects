class Person {

    String name;
    int rollNo;
    String section;
    String field;
    String university;

    void displayInfo() {

        System.out.println("My Name is " + name);
        System.out.println("My Roll No is " + rollNo);
        System.out.println("My Section is " + section);
        System.out.println("My Field is " + field);
        System.out.println("My University Name is " + university);

    }

}

class Tayyab extends Person {

    String studentID;

    void displayStudentID() {
        System.out.println("My Student ID is " + studentID);
    }

}

public class PersonDisplayInfo {

    public static void main(String[] args) {

        Tayyab tayyab = new Tayyab();
        
        tayyab.name = "Tayyab Ali";
        tayyab.rollNo = 003;
        tayyab.studentID = "ssuet3";
        tayyab.section = "A";
        tayyab.field = "Software Engineering Technology";
        tayyab.university = "Sir Syed University & Technology";
        
        tayyab.displayStudentID();
        tayyab.displayInfo();

    }

}