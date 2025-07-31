package Loops_Conditionals;

import java.util.Scanner;

public class sumOfDigits {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDig = num % 10;
            sum += lastDig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum is : " + sumOfDigit(n));
        sc.close();
    }
}
