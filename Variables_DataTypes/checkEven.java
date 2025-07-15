// Check if a Number is Even or Odd Using Boolean and Modulo

import java.util.Scanner;

public class checkEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        boolean isEven = (n % 2 == 0);
        System.out.print("number " + "is " + (isEven ? "Even" : "Odd"));
        sc.close();
    }
}
