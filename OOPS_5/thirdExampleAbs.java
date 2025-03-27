// Payment Processing System

abstract class Payment5 {
    abstract void processPayment(double amount);
}

class CreditCardPayment5 extends Payment5 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $ : " + amount);
    }
}

class PayPalPayment5 extends Payment5 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Pay Pal Payment of $ : " + amount);
    }
}

public class thirdExampleAbs {
    public static void main(String[] args) {
        Payment5 firstPay = new CreditCardPayment5();
        firstPay.processPayment(5000);

        Payment5 secondPay = new PayPalPayment5();
        secondPay.processPayment(1000);
    }
}
