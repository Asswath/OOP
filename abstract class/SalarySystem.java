abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class FullTime extends Employee {
    double monthlySalary;

    FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class Contract extends Employee {
    double hourlyRate;
    int hoursWorked;

    Contract(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTime("Alice", 5000);
        Employee emp2 = new Contract("Bob", 30, 160);

        System.out.println(emp1.name + "'s Salary: $" + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: $" + emp2.calculateSalary());
    }
}
