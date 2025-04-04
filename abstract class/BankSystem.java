abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into savings.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from savings.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount("John", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.showBalance();
    }
}
