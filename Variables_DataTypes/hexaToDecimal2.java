// Hexadecimal To Decimal Conversion 2

import java.util.Scanner;

public class hexaToDecimal2 {
    static void hexaToDec(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                value = 10 + (ch - 'A');
            } else if (ch >= 'a' && ch <= 'f') {
                value = 10 + (ch - 'a');
            } else {
                System.out.println("Invalid Character !");
                return;
            }
            decimal = decimal * 16 + value;
        }
        System.out.println("Decimal Value : "+decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal Value : ");
        String hexa = sc.nextLine();
        hexaToDec(hexa);
        sc.close();
    }
}
