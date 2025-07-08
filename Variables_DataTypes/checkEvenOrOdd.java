import java.util.Scanner;

public class checkEvenOrOdd {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter Positive Number !");
            return;
        }
        if (isEven(n))
            System.out.println("Even Number !");
        else
            System.out.println("Odd Number !");
        sc.close();
    }
}
