import java.util.Scanner;

public class hexaToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HexaValue : ");
        String hex = sc.nextLine();
        System.out.println("Integer Value : " + Integer.parseInt(hex, 16));
        sc.close();
    }
}