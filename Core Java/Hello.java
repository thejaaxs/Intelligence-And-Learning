import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello World From : " + name);
        sc.close();
    }
}