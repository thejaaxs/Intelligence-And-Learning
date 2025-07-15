// Reverse a String 

import java.util.Scanner;

public class reverseString {
    static String reverse(String str) {
        if (str.isEmpty() || str == null) {
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.print("Reversed String : " + reverse(str));
        sc.close();
    }
}
