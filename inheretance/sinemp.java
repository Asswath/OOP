
class Employee {
    String empName;
    int empId;
    double salary;

    Employee(String empName, int empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    String department;

    Manager(String empName, int empId, double salary, String department) {
        super(empName, empId, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}


public class sinemp {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Johnson", 101, 75000, "IT");
        mgr.displayManagerDetails();
    }
}
