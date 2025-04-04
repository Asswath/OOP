class BankAccount {
    private String holderName;
    private double balance;

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid or insufficient funds.");
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setHolderName("Ritika");
        acc.deposit(1000);
        acc.withdraw(200);

        System.out.println(acc.getHolderName() + "'s Balance: $" + acc.getBalance());
    }
}
