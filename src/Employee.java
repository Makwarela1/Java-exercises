
public class Employee {
    String empNumber;
    String empName;
    double monthlySalary;

    Employee(String empName, String empNumber, double monthlySalary) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.monthlySalary = monthlySalary;
    }

    public void empSalaries() {
        if (monthlySalary < 10000) {
            System.out.println(" You are earning below R10 000 ");
        } else if (monthlySalary < 20000) {
            System.out.println(" You are earning R10 000 to below R20 000");
        } else {
            System.out.println("You are earning above R20 000");
        }
    }

    public void displayDetails() {
        System.out.println("Employee Number:" + " " + empNumber);
        System.out.println("Employee Name:" + " " + empName);
        System.out.println("Employee Salary:" + " " + monthlySalary);
        empSalaries();
    }
}

