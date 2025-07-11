
import java.util.Scanner;

public class calculatorUsingSwitch {
    public static double calculator(int a, char ch, int b) {
        switch (ch) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division By Zero is Not Possible !");
                }
                return (double) a / b;

            case '%':
                if (b == 0)
                    throw new ArithmeticException("Modulo Using 0 Denominator is not Possible !");
                return a % b;

            default:
                throw new IllegalArgumentException("Enter Valid Operators / Numbers !");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter Operator : ");
            char ch = sc.next().charAt(0);
            System.out.println("Enter Second Number : ");
            int num2 = sc.nextInt();
            double result = calculator(num1, ch, num2);
            System.out.printf("Result : %.2f\n", result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error : Enter the Numbers / Operators Validly !");
        } finally {
            sc.close();
        }
        sc.close();
    }
}