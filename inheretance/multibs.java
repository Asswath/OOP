// Base class
class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void showBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Derived class (Child of Bank)
class Account extends Bank {
    String accountHolder;
    long accountNumber;

    Account(String bankName, String accountHolder, long accountNumber) {
        super(bankName);
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Another Derived class (Child of Account)
class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String bankName, String accountHolder, long accountNumber, double balance) {
        super(bankName, accountHolder, accountNumber);
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class
public class multibs {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("ABC Bank", "John Doe", 1234567890L, 15000.75);
        savingsAccount.showBankDetails();
        savingsAccount.showAccountDetails();
        savingsAccount.showBalance();
    }
}
