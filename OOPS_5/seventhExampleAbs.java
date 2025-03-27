// Advanced Banking System Using OOPS

abstract class BankAccount5 {
    protected double balance;

    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

interface InterestCalculatable5 {
    double calculateInterest5();
}

class SavingsAccount5 extends BankAccount5 implements InterestCalculatable5 {
    private double interestRate;

    SavingsAccount5(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate / 100;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    @Override
    public double calculateInterest5() {
        return balance * interestRate;
    }
}

public class seventhExampleAbs {
    public static void main(String args[]) {
        BankAccount5 acc1 = new SavingsAccount5(1000, 10);
        acc1.withdraw(100);
        System.out.println(acc1.getBalance());
        // Here the casting has to be done !
        double interest = ((InterestCalculatable5) acc1).calculateInterest5();
        System.out.println("Interest : " + interest);
    }
}
