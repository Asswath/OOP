
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Annual Interest: $" + interest);
    }
}


public class sinsa {
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount("John Doe", 1234567890L, 20000, 4.5);
        savingsAcc.displayAccountInfo();
        savingsAcc.calculateInterest();
    }
}
