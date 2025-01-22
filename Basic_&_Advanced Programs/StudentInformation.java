class StudentData {
    
    String name;
    int rollno;
    String field;
    String subject;

    public void bioData() {
    
        System.out.println("Name: " + name);
    
        System.out.println("Roll Number: " + rollno);
    
        System.out.println("Field: " + field);
    
        System.out.println("Subject: " + subject);
    
    }

}

public class StudentInformation {
    public static void main(String args[]) {

        StudentData studentNo1 = new StudentData();

        studentNo1.name = "Tayyab Ali";

        studentNo1.rollno = 003;

        studentNo1.field = "Software Engineering";

        studentNo1.subject = "Java Programming";

        studentNo1.bioData();

    }

}