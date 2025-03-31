// Division Handling Exception handling !

import java.util.Scanner;

public class DivisonHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numerator : ");
        int num = sc.nextInt();
        System.out.print("Enter the Denominator : ");
        int den = sc.nextInt();
        try {
            int res = num / den;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error : Divide By Zero Error !");
        }
        sc.close();
    }
}