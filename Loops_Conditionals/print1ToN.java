package Loops_Conditionals;

import java.util.Scanner;

public class print1ToN {
    static void oneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ending Number : ");
        int n = sc.nextInt();
        if (n <= 0 || n <= 1) {
            System.out.println(n);
            return;
        }
        oneToN(n);
        sc.close();
    }
}
