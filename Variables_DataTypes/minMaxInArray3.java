package Variables_DataTypes;

import java.util.Scanner;

public class minMaxInArray3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int max = arr[0], min = arr[0];
        for (int var : arr) {
            if (max < var)
                max = var;
            if (min > var)
                min = var;
        }
        System.out.println("Maximum : " + max);
        s.close();
    }
}
