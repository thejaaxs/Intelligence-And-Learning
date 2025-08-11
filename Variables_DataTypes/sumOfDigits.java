// Sum Of Digits Of a Number

import java.util.Scanner;

public class sumOfDigits {
    static int sumOfDig(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDig = n % 10;
            sum += lastDig;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Sum Of Digits in " + num + " is " + sumOfDig(num));
        sc.close();
    }
}
