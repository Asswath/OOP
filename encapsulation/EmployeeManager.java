class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setters
    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
        else System.out.println("Invalid salary!");
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Raj", 45000);
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(50000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
