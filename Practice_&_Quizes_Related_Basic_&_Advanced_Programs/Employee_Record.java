// Write a program that creates two classes one is Employee and another
// is the main method class. Employee class contains emp_code, name,
// designation and salary fields, and three constructors; one is a default
// constructor, the second constructor contains three field emp-code,
// name, and designation and if the designation is clerk set salary of Rs.
// 5000 if the designation is peon set salary of Rs. 2000 and if manager
// set salary of Rs. 10000 for others set the salary of Rs. 1000 and third
// constructor contain four fields emp_code, name, designation, and
// salary. Display information of employee using display method In Java.

class Employee {

    int emp_code;
    String name;
    String designation;
    int salary;

    Employee() {
        this.emp_code = 0;
        this.name = "";
        this.designation = "";
        this.salary = 0;
    }

    Employee(int emp_code, String name, String designation) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        salaryBasedOnDesignation();
    }

    void salaryBasedOnDesignation() {
        if (designation.equalsIgnoreCase("clerk")) {
            salary = 5000;
        } else if (designation.equalsIgnoreCase("peon")) {
            salary = 2000;
        } else if (designation.equalsIgnoreCase("manager")) {
            salary = 10000;
        } else {
            salary = 1000;
        }
    }

    Employee(int emp_code, String name, String designation, int salary) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayEmployeeData() {
        System.out.println("Employee Code: " + emp_code);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
    }

}

public class Employee_Record {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Employee employee = new Employee(3, "Deved", "manager");
        employee.displayEmployeeData();

    }

}