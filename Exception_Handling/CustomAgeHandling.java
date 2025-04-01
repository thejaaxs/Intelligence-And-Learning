// Custom Age Exception !

import java.util.Scanner;

class AgeException1 extends Exception {
    public AgeException1(String message) {
        super(message);
    }
}

public class CustomAgeHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        try{
            if(age<18){
                throw new AgeException1("You Must Be Above 18 !");
            } 
            System.out.println("You are eligible to register !");
        }catch(AgeException1 e){
            System.out.println(e.getMessage());
        }
    }
}