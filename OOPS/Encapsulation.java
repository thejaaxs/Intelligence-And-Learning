package OOPS;

import java.util.Scanner;

class student {
    private String name;
    private int roll_no;
    private float marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        student s = new student();
        s.setName("Thejas");
        System.out.println(s.getName());
        s.setRollNo(21055);
        System.out.println(s.getRollNo());
        s.setMarks(100);
        System.out.println(s.getMarks());
        sc.close();
    }
}
