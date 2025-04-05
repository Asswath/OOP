
class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}


class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void manageTeam() {
        System.out.println(name + " manages the " + department + " department.");
    }
}


class Director extends Manager {
    double budget;

    Director(String name, int empId, String department, double budget) {
        super(name, empId, department);
        this.budget = budget;
    }

    void allocateBudget() {
        System.out.println(name + " has allocated a budget of $" + budget);
    }
}

public class multiemp {
    public static void main(String[] args) {
        Director director = new Director("Alice Johnson", 101, "Finance", 500000);
        director.displayDetails();
        director.manageTeam();
        director.allocateBudget();
    }
}
