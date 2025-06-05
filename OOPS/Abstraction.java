package OOPS;

abstract class bankAccount {
    int balance = 0;

    abstract void deposit(int amount);

    abstract void withdraw(int amount);
}

class SavingsAccount extends bankAccount {
    void deposit(int amount) {
        balance += amount;
        System.out.println("Savings : Deposited " + amount);
    }

    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Savings : Withdraw " + amount);
    }
}

class CurrentAccount extends bankAccount {
    void deposit(int amount) {
        balance += amount;
        System.out.println("Current : Deposited " + amount);
    }

    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Current : Withdraq " + amount);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        bankAccount s = new SavingsAccount();
        s.deposit(1000);
        s.withdraw(1000);
    }
}
