// Swapping 2 Numbers Using Without Third Variables

import java.util.Scanner;

public class swapTwoNumbers {

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a + " ");
        System.out.print(b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.print(num1 + " " + num2+"\n");
        swap(num1, num2);
        sc.close();
    }
}