public class RandomStudents {
    public static void main(String[] args) {

        String[] first = { "John", "Emma", "Mike", "Sara", "David",
                "Lisa", "James", "Emily", "Dan", "Sophie" };

        String[] last = { "Smith", "Lee", "Wang", "Patel", "Kim",
                "Jones", "Singh", "Brown", "Ali", "Garcia" };

        String[] courses = { "CS", "Math", "Physics", "Biology", "Chemistry" };

        System.out.println("ID\tName\t\tCourse\t\tRoll No");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 10; i++) {
            String id = "S" + String.format("%02d", i + 1);
            String name = first[i] + " " + last[i];
            String course = courses[i % 4];
            int roll = 100 + (i + 1);

            System.out.printf("%s\t%s\t%s\t\t%d\n", id, name, course, roll);
        }
    
    }

}