// To check the even or odd using the BITWISE operators !

package Variables_DataTypes;

import java.util.Scanner;

public class evenOrOddUsingBitwise {
    public static boolean evenOrOddUsingOR(int n) {
        return (n ^ 1) == (n + 1);
    }

    static boolean evenOrOddUsingAND(int n) {
        return (n & 1) == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (evenOrOddUsingOR(n))
            System.out.println(n + " is an Even !");
        else
            System.out.println(n + " is an Odd !");
        if (evenOrOddUsingAND(n))
            System.out.print(n + " is an Even !");
        else
            System.out.println(n + " is an Odd !");
        sc.close();
    }
}

// The condition is that :
// num ^ 1 == num + 1 , for even
// num ^ 1 == num - 1 , for odd !