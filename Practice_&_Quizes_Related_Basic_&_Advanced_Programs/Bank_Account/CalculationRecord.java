import bank_account.*;

public class CalculationRecord {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Customers customerInterest = new Customers();
        Employees employeeInterest = new Employees();

        double customerAmount = 5000, customerRate = 5;
        double employeeAmount = 8000, employeeRate = 7;

        double customerInterestAmount = customerInterest.calculateInterest(customerAmount, customerRate);
        double employeeInterestAmount = employeeInterest.calculateSpecialInterest(employeeAmount, employeeRate);

        System.out.println("Customer Interest Amount: " + customerInterestAmount);
        System.out.println("Employee Special Interest Amount: " + employeeInterestAmount);
        
    }
    
}