// Check Palindrome In a String !

import java.util.Scanner;

public class checkPalindrome {
    static boolean checkIsPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        if (checkIsPalindrome(str))
            System.out.println("Palindrome !");
        else
            System.out.println("Not Palindrome !");
        sc.close();
    }
}
