package Loops_Conditionals;

import java.util.Scanner;

public class pyramidStar {
    static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Star : ");
        int n = sc.nextInt();
        printPyramid(n);
        System.out.println();
        printInvertedPyramid(n);
        sc.close();
    }
}
