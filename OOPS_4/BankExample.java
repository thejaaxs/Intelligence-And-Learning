// Bank Example using OOPS

class BankAccount1 {
    private String accountHolder;
    private double balance;

    public BankAccount1(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 00) {
            balance += amount;
            System.out.println("Deposited Amount is : " + amount);
        } else
            System.out.println("Amount must be in positive !");
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn Amount is : " + amount);
        } else
            System.out.println("Not Sufficient Fund !");
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1("Raghavendra", 10000);

        System.out.println("Holder Name : " + account.getAccountHolder());
        System.out.println("The Current Balance is : " + account.getBalance());
        account.deposit(10000);
        System.out.println("Updated Balance is : " + account.getBalance());
        account.withdraw(10000);
        System.out.println("The Final Balance is : " + account.getBalance());
    }
}