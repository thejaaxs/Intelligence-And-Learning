// Finding the largest & Smallest Number using the Loops !

package Variables_DataTypes;

import java.util.Scanner;

public class minMaxInArray2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size Of The Array : ");
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Size !");
            return;
        }
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
        s.close();
    }
}