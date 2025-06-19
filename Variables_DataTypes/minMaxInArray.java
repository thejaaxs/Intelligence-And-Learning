// The Finding of largest and Smallest Number in an Array !

package Variables_DataTypes;

import java.util.Scanner;
import java.util.Arrays;

public class minMaxInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of The Array : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Size Of The Array !!");
            return;
        }
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Minimum Element : " + arr[0]);
        System.out.println("Maximum Element : " + arr[arr.length - 1]);
        sc.close();
    }
}