import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance >= 0 ? balance : 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : $" + amount);
        } else {
            System.out.println("Invalid Deposit Amount !");
        }
    }

    public boolean withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : $" + amount);
            return true;
        } else {
            System.out.println("Invalid Withdrawl Of Amount Or Insufficient Funds");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class simpleBankAccountClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Account Number : ");
        String accNum = sc.nextLine();
        System.out.println("Enter the Initial Balance : ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, initialBalance);

        try {
            System.out.println("Enter the Deposit Amount : ");
            double deposit = sc.nextDouble();
            account.deposit(deposit);
            System.out.println("Enter the Withdrawl Amount : ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println("Final Balance : $" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error Invalid Input");
        } finally {
            sc.close();
        }
        sc.close();
    }
}
