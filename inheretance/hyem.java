
class Employee {
    String empName;
    int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
    }
}

interface Department {
    void showDepartment();
}

class Manager extends Employee implements Department {
    String departmentName;

    Manager(String empName, int empId, String departmentName) {
        super(empName, empId);
        this.departmentName = departmentName;
    }

    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }

    void displayManagerInfo() {
        displayEmployeeInfo();
        showDepartment();
    }
}


public class hyem {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Johnson", 101, "IT");
        mgr.displayManagerInfo();
    }
}
