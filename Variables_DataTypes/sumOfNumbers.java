// Sum of Numbers in a Range

import java.util.Scanner;

public class sumOfNumbers {
    public static int calculate(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start : ");
        int start = sc.nextInt();
        System.out.print("Enter End : ");
        int end = sc.nextInt();
        System.out.println("The Sum in Range : " + calculate(start, end));
        sc.close();
    }
}