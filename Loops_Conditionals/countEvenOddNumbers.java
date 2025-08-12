// Count Even And Odd Numbers

package Loops_Conditionals;

import java.util.Scanner;

public class countEvenOddNumbers {
    static int countOdd(int n) {
        int count = 0;
        while (n != 0) {
            int lastDig = n % 10;
            if (lastDig % 2 != 0)
                count++;
            n /= 10;
        }
        return count;
    }

    static int countEven(int n) {
        int count = 0;
        while (n != 0) {
            int lastDig = n % 10;
            if (lastDig % 2 == 0)
                count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Even Numbers in " + n + " is : " + countEven(n));
        System.out.print("The Odd Numbers in " + n + " is : " + countOdd(n));
        sc.close();
    }
}
