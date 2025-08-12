// Fibonacci Series

package Loops_Conditionals;

import java.util.Scanner;

public class printFibonacci {
    static void fib(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int fibonacci = a + b;
            System.out.print(fibonacci+" ");
            a = b;
            b = fibonacci;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        fib(num);
        sc.close();
    }
}
