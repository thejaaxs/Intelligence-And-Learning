// Calculating the Area & Perimeter of the Circle using the MATH.PI 

package Variables_DataTypes;

import java.util.Scanner;

public class circleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        double radius = sc.nextDouble();
        if (radius < 0) {
            System.out.println("Radius Cannot be negative");
            return;
        }
        double area = Math.PI * Math.pow(radius, 2.0);
        double circumference = 2.0 * Math.PI * radius;
        System.out.printf("Area : %.2f\n", area);
        System.out.printf("Circumference : %.2f", circumference);
        sc.close();
    }
}