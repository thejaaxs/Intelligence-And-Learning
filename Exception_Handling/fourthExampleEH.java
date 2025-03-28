// Custom Exception Handling 

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class fourthExampleEH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new AgeException("Age must be 18 or above to vote !");
            }
            System.out.println("You can Vote !");
        } catch (AgeException e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
        sc.close();
    }
}
