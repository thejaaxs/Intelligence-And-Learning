import java.util.Scanner;

public class arrayElementSearch {
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index == -1)
            System.out.print(target + " Not Found !");
        else
            System.out.print(target + " found at Index : " + index);
        sc.close();
    }
}
