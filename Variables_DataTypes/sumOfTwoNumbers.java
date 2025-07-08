// Sum of Two Numbers

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int n2 = sc.nextInt();
        if (n1 < 0 || n2 < 0) {
            System.out.println("Enter Positive Numbers !");
            return;
        }
        System.out.println("Sum of 2 Numbers is : " + sumOfTwo(n1, n2));
        sc.close();
    }
}
