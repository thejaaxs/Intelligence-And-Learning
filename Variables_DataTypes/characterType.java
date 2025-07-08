// Check Character Type

import java.util.Scanner;

public class characterType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char n = sc.next().charAt(0);
        if (Character.isDigit(n))
            System.out.println(n + " is a Digit");
        else if (Character.isAlphabetic(n)) {
            n = Character.toLowerCase(n);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')
                System.out.println(n + " is a Vowel");
            else
                System.out.println(n + " is a Consonant");
        } else
            System.out.println(n + " Special Character");
        sc.close();
    }
}
