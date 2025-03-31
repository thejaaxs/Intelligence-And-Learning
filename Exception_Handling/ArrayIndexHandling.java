// Array Index Handling !

import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Index : ");
        int index = sc.nextInt();
        try {
            System.out.println("Array Element is : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Array Index Out Of Bounds !");
        }
        sc.close();
    }
}
