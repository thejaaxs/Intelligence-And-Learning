package OOPS;

import java.util.Scanner;

class Person5 {
    String name;
    int age;

    void greet() {
        System.out.println("Hello I am a Person !");
    }
}

class Student5 extends Person5 {
    int rollNo;

    @Override
    public void greet() {
        System.out.println("Hello i am a Student !");
    }
}

class Teacher5 extends Person5 {
    String subject;

    @Override
    void greet() {
        System.out.println("Hello i am a Teacher");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student5 s = new Student5();
        s.name = "Thejas";
        s.greet();
        Teacher5 t = new Teacher5();
        t.name = "Arun";
        t.greet();
        sc.close();
    }
}
