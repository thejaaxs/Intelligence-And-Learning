// Simple Interest Calculator 

import java.util.Scanner;

public class simpleInterestCalc {
    static double simpleInterest(double amt, double roi, double time) {
        return (amt * roi * time) / 100;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        double amount = sc.nextDouble();
        System.out.print("Enter the Rate Of Interest : ");
        double rateOfInterest = sc.nextDouble();
        System.out.print("Enter the Time Period : ");
        double timePeriod = sc.nextFloat();
        System.out.println("Total Simple Interest : " + simpleInterest(amount, rateOfInterest, timePeriod));
        sc.close();
    }
}
