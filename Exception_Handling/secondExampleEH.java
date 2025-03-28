// Array Index Out Of Bounds !

public class secondExampleEH {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        try {
            System.out.println(arr[5]); // Index Out !
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds !");
        }
    }
}
