// Program to print the LCM and GCD of a Number !

package Loops_Conditionals;

import java.util.Scanner ;
public class LCMandGCD {
    static int gcd(int a , int b){
        // if b == 0 , then a is the GCD 
        while(b!=00){
            int temp = b ;
            b = a % b ;
            a = temp ;
        }
        return a ;
    }
    static int lcm(int a , int b){
        return (a * b) / gcd(a,b) ;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Lcm Of the Numbers are : "+lcm(a,b));
        System.out.println("The GCD of the Numbers are : "+gcd(a,b));
        sc.close();
    }
}
