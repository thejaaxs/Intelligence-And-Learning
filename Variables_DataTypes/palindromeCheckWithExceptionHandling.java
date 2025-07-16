import java.util.Scanner;

public class palindromeCheckWithExceptionHandling {
    static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            if (isPalindrome(str))
                System.out.println(str + " is a Palindrome !");
            else
                System.out.println(str + " is not a Palindrome !");
        } catch (Exception e) {
            System.out.println("Invalid Error : Enter valid String !");
        } finally {
            sc.close();
        }
    }
}
