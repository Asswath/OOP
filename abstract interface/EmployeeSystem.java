
interface Salary {
    void calculateSalary();
}


abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void displayRole();
}


class FullTimeEmployee extends Employee implements Salary {
    double salary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }
    void displayRole() {
        System.out.println("Full-Time Employee: " + name);
    }
    public void calculateSalary() {
        System.out.println(name + "'s Monthly Salary: $" + salary);
    }
}


class PartTimeEmployee extends Employee implements Salary {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    void displayRole() {
        System.out.println("Part-Time Employee: " + name);
    }

    
    public void calculateSalary() {
        System.out.println(name + "'s Weekly Salary: $" + (hourlyRate * hoursWorked));
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 20, 25);

        emp1.displayRole();
        emp1.calculateSalary();

        emp2.displayRole();
        emp2.calculateSalary();
    }
}
