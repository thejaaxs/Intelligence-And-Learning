package Loops_Conditionals;

import java.util.Scanner;

public class reversingNumber {
    static void reverseNum(int n) {
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        System.out.println("The Reversed Number is : " + rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        reverseNum(n);
        sc.close();
    }
}
