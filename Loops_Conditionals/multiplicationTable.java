// Multiplication Table

package Loops_Conditionals;

import java.util.Scanner;

public class multiplicationTable {
    public static void multiplicationTablePrint(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void multiplicationPrintNegative(int n) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n < 0)
            multiplicationPrintNegative(n);
        else
            multiplicationTablePrint(n);
        sc.close();
    }
}
