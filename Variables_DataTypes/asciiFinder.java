// ASCII Value Finder

import java.util.Scanner;

public class asciiFinder {
    static int asciiValue(char ch) {
        return (int) ch;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        System.out.print("The ASCII Value : " + asciiValue(ch));
        sc.close();
    }
}
