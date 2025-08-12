// Reversing a Number

package Loops_Conditionals;

import java.util.Scanner;

public class reverseAnInteger {
    static int rev(int n) {
        int rev = 0;
        while (n != 0) {
            int lastDig = n % 10;
            rev = (rev * 10) + lastDig;
            n /= 10;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("The Reverse is : " + rev(num));
        sc.close();
    }
}
