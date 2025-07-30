package Loops_Conditionals;

import java.util.Scanner;

public class fibonacciUptoN {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
