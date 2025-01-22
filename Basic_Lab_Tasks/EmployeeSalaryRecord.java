class EmployeeData {
    
    String name;
    String designation;
    int salary;
    int expenses; // Fixed typo here
    int saving;

    EmployeeData(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        calculateDeductions();
    }

    void calculateDeductions() {
        expenses = salary / 2; // Assuming half salary goes to expenditures
        saving = salary - expenses; // Remaining salary is savings
    }

    void promote(String newDesignation, int newSalary) {
        designation = newDesignation;
        salary = newSalary;
        calculateDeductions();
    }

    void displayDetails() {
        System.out.println("\n Mr. " + name + " got promoted as Senior " + designation
                + ", his monthly income is " + salary
                + ", expenditures are " + expenses
                + ", and savings are " + saving + ". \n");
    }
}

public class EmployeeSalaryRecord {

    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData("Deved", "Software Engineer", 100000);

        employeeData.displayDetails();

    }

}