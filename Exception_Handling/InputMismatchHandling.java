// Input Mismatch Handling !

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Number : ");
            int num = sc.nextInt();
            System.out.println("Number : " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input , Please Enter Integer !");
        }
        sc.close();
    }
}
