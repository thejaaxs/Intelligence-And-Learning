// Multiple Exception Handling !

import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int res[] = new int[2];
        try {
            System.out.println("Enter Numerator : ");
            int num = sc.nextInt();
            System.out.println("Enter Denominator : ");
            int den = sc.nextInt();

            res[0] = num / den;
            res[2] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Error : Divide by Zero Error !");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Array Index Out Of Bounds !");
        }
        sc.close();
    }
}
