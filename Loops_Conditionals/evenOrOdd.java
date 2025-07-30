package Loops_Conditionals;

import java.util.Scanner;

public class evenOrOdd {
    static boolean evenOrOddNum(int n) {
        return (n ^ 1) == (n + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Enter Positive Number");
            return;
        }
        if (evenOrOddNum(num))
            System.out.println("Even Number !");
        else
            System.out.println("Odd Number !");
        sc.close();
    }
}
