// Null Pointer Exception !

import java.util.Scanner;

public class NullPointerHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = null;
        try {
            System.out.println("The Length of the String is : " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error : Null Pointer Exception (String Is Null !)");
        }
        sc.close();
    }
}
