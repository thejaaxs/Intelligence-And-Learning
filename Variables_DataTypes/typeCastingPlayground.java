// Type Casting Playground

import java.util.Scanner;

public class typeCastingPlayground {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        double num = sc.nextDouble();
        System.out.println("Integer Part : " + (int) num);
        System.out.println("Float Part : " + (num - (int) num));
        System.out.println("Rounded Value : " + Math.round(num));
        sc.close();
    }
}
