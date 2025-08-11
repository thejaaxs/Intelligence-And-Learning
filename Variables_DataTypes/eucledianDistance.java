// Eucledian Distance

import java.util.Scanner;

public class eucledianDistance {
    static double eucledianDistanceCalc(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter X2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y2 : ");
        int y2 = sc.nextInt();
        System.out.printf("The Eucledian Distance : %.2f", eucledianDistanceCalc(x1, y1, x2, y2));
        sc.close();
    }
}
