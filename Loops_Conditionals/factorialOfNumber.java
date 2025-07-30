package Loops_Conditionals;

import java.util.Scanner;

public class factorialOfNumber {
    static long factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Factorial : " + factorial(num));
        sc.close();
    }
}
