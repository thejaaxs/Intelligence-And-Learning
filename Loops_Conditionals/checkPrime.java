package Loops_Conditionals;

import java.util.Scanner;

public class checkPrime {
    static boolean checkPrimeNum(int num) {
        boolean isPrime = true;
        if (num <= 2)
            return isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (checkPrimeNum(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
        sc.close();
    }
}