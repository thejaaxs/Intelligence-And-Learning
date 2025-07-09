// Print Multiplication Table

import java.util.Scanner;

public class printMultiplicationTable {
    static void printMultiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not Possible");
            return;
        }
        printMultiplication(n);
        sc.close();
    }
}
