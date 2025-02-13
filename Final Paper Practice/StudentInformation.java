class Student {

    private String id;
    String name;
    protected int age;
    public String course;

    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private void displayId() {
        System.out.println("ID: " + id);
    }

    protected void displayAge() {
        System.out.println("Age: " + age);
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayDetails() {
        displayId();
        displayName();
        displayAge();
        System.out.println("Course: " + course);
    }

}

class Graduate extends Student {

    public Graduate(String id, String name, int age, String course) {
        super(id, name, age, course);
    }

    void showAge() {
        displayAge();
    }

}

public class StudentInformation {
    public static void main(String[] args) {

        Student s1 = new Student("S123", "Ali", 21, "Physics");
        s1.displayDetails();

        Graduate g1 = new Graduate("S456", "Hassan", 22, "Math");
        g1.showAge();
    }

}