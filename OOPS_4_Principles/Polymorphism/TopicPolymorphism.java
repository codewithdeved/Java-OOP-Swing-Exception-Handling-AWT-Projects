class StudentBioDatabase {
    
    String name;
    int age;

    public void StudentBioDataDisplay(String name) {
        System.out.println("My name is " + name);
    }

    public void StudentBioDataDisplay(int age) {
        System.out.println("My age is " + age);
    }

    public void StudentBioDataDisplay(String name, int age) {
        System.out.println("My name is " + name + " & My age is " + age);
    }
}

public class TopicPolymorphism {
    
    public static void main(String args[]) {

        System.out.println("Let's Print The Student Bio Data.");
    
        StudentBioDatabase studentNum1 = new StudentBioDatabase();
    
        studentNum1.name = "Tayyab Ali";
    
        studentNum1.age = 21;
    
        studentNum1.StudentBioDataDisplay(studentNum1.name, studentNum1.age);
    
    }

}