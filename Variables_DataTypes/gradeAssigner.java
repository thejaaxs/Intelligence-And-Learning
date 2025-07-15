// Grade Calculator

import java.util.Scanner;

public class gradeAssigner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score ( 0 - 100 ) : ");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("Invalid Score !");
        } else {
            char grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                default:
                    grade = 'F';
                    break;
            }
            System.out.println("Grade : " + grade);
        }
        sc.close();
    }
}
