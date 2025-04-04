
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}


interface Loan extends Bank {
    void applyForLoan(double amount);
}


class Customer implements Loan {
    private double balance;

    Customer(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", Remaining Balance: $" + balance);
        }
    }

    
    public void applyForLoan(double amount) {
        System.out.println("Loan of $" + amount + " applied successfully.");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Customer cust = new Customer(1000);
        cust.deposit(500);
        cust.withdraw(200);
        cust.applyForLoan(5000);
    }
}
