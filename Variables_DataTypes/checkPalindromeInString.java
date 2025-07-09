// Check Palindrome String

import java.util.Scanner;

public class checkPalindromeInString {
    static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        String reverse = new StringBuffer(str).reverse().toString().toLowerCase();
        return str.equals(reverse);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        if (str.length() == 1) {
            System.out.println("Palindrome");
            return;
        }
        if (checkPalindrome(str))
            System.out.println("Palindrome !");
        else
            System.out.println("Not Palindrome !");
        sc.close();
    }
}
