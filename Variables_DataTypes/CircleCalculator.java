// Calculating the Area & Perimeter of the Circle using the MATH.PI 

package Variables_DataTypes;

import java.util.Scanner ;
public class CircleCalculator {
    static double area(double radius){ 
        return Math.PI * radius * radius ;
    }
    static double circumference(double radius){
        return Math.PI * radius * 2.0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        double radius = sc.nextDouble();
        System.out.printf("The Area of the Circle : %.2f\n",area(radius));
        System.out.printf("The Circumference of the Circle : %.2f",circumference(radius));
        sc.close();
    }
}