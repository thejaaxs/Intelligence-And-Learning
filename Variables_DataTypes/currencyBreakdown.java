// Currency Breakdown

import java.util.Scanner;

public class currencyBreakdown {
    static void currencyBreakdownFunction(int amount) {
        int notes500 = amount / 500;
        amount %= 500;
        int notes100 = amount / 100;
        amount %= 100;
        int notes50 = amount / 50;
        amount %= 50;
        int notes10 = amount / 10;
        amount %= 10;
        int notes5 = amount / 5;
        amount %= 5;

        int notes1 = amount;

        System.out.println("$ 500 Notes : " + notes500);
        System.out.println("$ 100 Notes : " + notes100);
        System.out.println("$ 50 Notes : " + notes50);
        System.out.println("$ 10 Notes : " + notes10);
        System.out.println("$ 5 Notes : " + notes5);
        System.out.println("$ 1 Notes : " + notes1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        int amount = sc.nextInt();
        currencyBreakdownFunction(amount);
        sc.close();
    }
}