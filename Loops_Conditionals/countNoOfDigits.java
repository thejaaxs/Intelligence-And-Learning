package Loops_Conditionals;

import java.util.Scanner;

public class countNoOfDigits {
    static int countDig(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Total Digits in " + num + " is : 1");
            return;
        }
        System.out.println("Total Digits in " + num + " is : " + countDig(num));
        sc.close();
    }
}
