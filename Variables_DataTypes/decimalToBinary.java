package Variables_DataTypes;

import java.util.Scanner;

public class decimalToBinary {
    static String decToBin(int decimal) {
        StringBuffer binary = new StringBuffer();
        while (decimal != 0) {
            int lastDig = decimal % 2;
            binary.append(lastDig);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    static int binToDec(int binary) {
        int base = 1, dec = 0;
        while (binary != 0) {
            int lastDig = binary % 10;
            dec += lastDig * base;
            base *= 2;
            binary /= 10;
        }
        return dec;
    }

    public static void main(String argsq[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Decimal Number : ");
        int decimal = sc.nextInt();
        System.out.print("Binary Format : " + decToBin(decimal) + "\n");
        System.out.print("Enter a Binary Number : ");
        int binary = sc.nextInt();
        System.out.println("Decimal Format : " + binToDec(binary));
        sc.close();
    }
}