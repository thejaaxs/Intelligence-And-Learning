// Time Conversion 

import java.util.Scanner;

public class timeConversion {
    static void timeConvert(int sec) {
        int hours = sec / 3600;
        sec %= 3600;
        int minutes = sec / 60;
        sec %= 60;
        System.out.printf("%d Hour, %d Minutes, %d Seconds", hours, minutes, sec);
        // System.out.printf("%d hour%s, %d minute%s, %d second%s\n",
        // hours, hours == 1 ? "" : "s",
        // minutes, minutes == 1 ? "" : "s",
        // sec, sec == 1 ? "" : "s");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Time in Seconds : ");
        int seconds = sc.nextInt();
        timeConvert(seconds);
        sc.close();
    }
}
