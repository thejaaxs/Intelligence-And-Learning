// Count Digits of a Number

import java.util.Scanner;

public class countDigits {
    public static int countDigit(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Count :: " + countDigit(n));
        sc.close();
    }
}
