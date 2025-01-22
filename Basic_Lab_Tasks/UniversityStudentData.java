class User {

    String name;
    int rollNo;
    String section;
    String field;
    String university;

    void userInfo() {

        System.out.println("My Name is " + name);
        System.out.println("My Roll No is " + rollNo);
        System.out.println("My Section is " + section);
        System.out.println("My Field is " + field);
        System.out.println("My University Name is " + university);

    }

}

class Fellow extends User {

    String studentID;

    @Override void userInfo() {
        System.out.println("My Student ID is " + studentID);
        super.userInfo();
    }

}

public class UniversityStudentData {

    public static void main(String[] args) {

        Fellow fellow = new Fellow();
        
        fellow.name = "Deved";
        fellow.rollNo = 003;
        fellow.studentID = "ssuet3";
        fellow.section = "A";
        fellow.field = "Software Engineering Technology";
        fellow.university = "Sir Syed University & Technology";
        
        fellow.userInfo();

    }

}
