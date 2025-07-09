// Greatest of Three Numbers

import java.util.Scanner;

public class greatestOfThree {
    public static void greatestOfThreeNumbers(int a, int b, int c) {
        if (a == b && a == c && b == c)
            System.out.println(a + " " + b + " " + c + " Eqaul !");
        else if (a > b && a > c)
            System.out.println(a + " is greater than All !");
        else if (b > a && b > c)
            System.out.println(b + " is greater than All !");
        else
            System.out.println(c + " is greater than All !");
    }
    // Using the other Method

    static int greatestOfThreeNum(int a, int b, int c) {
        return Math.max(Math.max(a, b), Math.max(b, c));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("All Are Eqaul !");
            return;
        }
        greatestOfThreeNumbers(num1, num2, num3);
        System.out.println("Greatest Is : " + greatestOfThreeNum(num1, num2, num3));
        sc.close();
    }
}
