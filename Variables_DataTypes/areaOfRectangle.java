// Calculate the Area Of a Rectangle

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int length = sc.nextInt();
        System.out.print("Enter Width : ");
        int width = sc.nextInt();
        if (length <= 0 && width <= 0) {
            System.out.println("Not Possible with negative Dimensions !");
        } else {
            System.out.print("Area Of Rectangle : " + (length * width));
        }
        sc.close();
    }
}
