package OOPS;

class Student {
    String name;
    int roll_no;
    float marks;

    Student(String name, int roll_no, float marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name : " + name + "\nRoll Number : " + roll_no + "\nMarks : " + marks);
    }
}

public class student10 {
    public static void main(String args[]) {
        Student std1 = new Student("Thejas", 055, 100.00f);
        Student std2 = new Student("Rahul", 001, 99.99f);
        std1.displayDetails();
        std2.displayDetails();

    }
}
