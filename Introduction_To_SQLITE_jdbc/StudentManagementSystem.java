import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManagementSystem {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\\n");

        String url = "jdbc:sqlite:C:/Users/TAYYAB/OneDrive/Desktop/Java SQLITE jdbc/bin/student_management.db"; // Correct path to your DB

        try (Connection conn = DriverManager.getConnection(url)) {
            
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");

                String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name TEXT NOT NULL," +
                        "age INTEGER NOT NULL," +
                        "grade TEXT NOT NULL);";
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(createTableSQL);
                    System.out.println("Table created or already exists.");
                }

                String insertDataSQL = "INSERT INTO students (name, age, grade) VALUES " +
                        "('Tayyab Ali', 21, 'A')," +
                        "('Deved', 22, 'B')," +
                        "('Syntax', 20, 'A')," +
                        "('Error', 23, 'C');";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(insertDataSQL);
                    System.out.println("Sample data inserted.");
                }

                String querySQL = "SELECT * FROM students;";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(querySQL)) {

                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id") +
                                " | Name: " + rs.getString("name") +
                                " | Age: " + rs.getInt("age") +
                                " | Grade: " + rs.getString("grade"));
                    }
                }

                // Update data
                String updateDataSQL = "UPDATE students SET grade = 'B' WHERE name = 'Syntax';";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(updateDataSQL);
                    System.out.println("Updated data for Syntax.");
                }

                // Delete data
                String deleteDataSQL = "DELETE FROM students WHERE name = 'Error';";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(deleteDataSQL);
                    System.out.println("Deleted data for Error.");
                }

                // Display remaining records
                System.out.println("Remaining student records:");
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT * FROM students;")) {

                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id") +
                                " | Name: " + rs.getString("name") +
                                " | Age: " + rs.getInt("age") +
                                " | Grade: " + rs.getString("grade"));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}