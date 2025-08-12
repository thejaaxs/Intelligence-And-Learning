// Prime Number Checker ( & Counter )

package Loops_Conditionals;

import java.util.Scanner;

public class primeNumberCounter {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static void primeCheckCount(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int n2 = sc.nextInt();
        primeCheckCount(n1, n2);
        sc.close();
    }
}
