// Temperature Converter 

import java.util.Scanner;

public class tempConverter {
    static double fahrenheit(double cel) {
        return (cel * 9 / 5 + 32);
    }

    static double celsius(double fah) {
        return (fah - 32) * 5 / 9;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Celsius : ");
        double cel = sc.nextDouble();
        System.out.println("The Fahrenheit : " + fahrenheit(cel) + " F");
        System.out.print("Enter the Fahrenheit : ");
        double fah = sc.nextDouble();
        System.out.print("The Celsius : " + celsius(fah)+" C");
        sc.close();
    }
}
