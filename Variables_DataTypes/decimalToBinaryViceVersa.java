package Variables_DataTypes;

import java.util.Scanner;

public class decimalToBinaryViceVersa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int decimal = sc.nextInt();
        System.out.println("The Binary Number is : " + Integer.toBinaryString(decimal));
        sc.nextLine();
        System.out.print("Enter the Binary Number : ");
        String binary = sc.nextLine();
        if (!binary.matches("[01]+"))
            System.out.println("Please Enter Binary Digit Only !");
        else
            System.out.println("The Decimal Number is : " + Integer.parseInt(binary, 2));
        sc.close();
    }
}
