package Loops_Conditionals;

import java.util.Scanner;

public class checkLeapYear {
    static boolean checkLeap(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if (checkLeap(year))
            System.out.println(year + " is a Leap Year !");
        else
            System.out.println(year + " not a leap Year !");
        sc.close();
    }
}
