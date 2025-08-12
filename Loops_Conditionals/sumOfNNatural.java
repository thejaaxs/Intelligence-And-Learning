// Sum Of N Natural Numbers

package Loops_Conditionals;

import java.util.Scanner;

public class sumOfNNatural {
    static int sumOfN(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("The Sum of " + n + " Natural Number is " + sumOfN(n));
        sc.close();
    }
}
