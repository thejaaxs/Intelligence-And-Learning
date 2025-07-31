package Loops_Conditionals;

import java.util.Scanner;

public class printEvenNumbers {
    static void printEvenTillN(int n){
        for(int i=0;i<=n;i+=2){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        printEvenTillN(num);
        sc.close();
    }
}
