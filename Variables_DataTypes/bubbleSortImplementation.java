// Bubble Sort Implementation

import java.util.Scanner;

public class bubbleSortImplementation {
    static void bubbleSort(int arr[]) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();
        System.out.print("Enter the Array Elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The Array Elements before sorting : ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.print("Array after Sorting : ");
        for (int items : arr) {
            System.out.print(items + " ");
        }
        sc.close();
    }
}
