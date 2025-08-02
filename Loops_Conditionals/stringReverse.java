package Loops_Conditionals;

import java.util.Scanner;

public class stringReverse {
    static String reverse(String str) {
        char[] ch = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Reverse : " + reverse(str));
        sc.close();
    }
}
