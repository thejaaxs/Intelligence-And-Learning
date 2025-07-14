import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double gpa;
    private String department;

    public Student() {
        this.name = "unknown";
        this.rollNumber = 0;
        this.gpa = 0.0f;
        this.department = "unknown";
    }

    public Student(String name, int rollNumber, double gpa, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = (gpa >= 0.0 && gpa <= 5.0) ? gpa : 0.00;
        this.department = department != null ? department : "Not Assigned";
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 5.0)
            this.gpa = gpa;
        else
            System.out.println("Error: GPA must be between 0.0 and 4.0.");
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Student : " + name + "\nRoll Number : " + rollNumber + "\nGPA : " + gpa + "\nDepartment : "
                + department);
    }
}

public class encapsulationEg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student("Alice", 150520, 4.8, "Mathematics");
        st.displayDetails();
        Student st1 = new Student();
        st1.displayDetails();

        System.out.println(st.getName());
        st.setName("Thejas");
        System.out.println(st.getName());
        sc.close();
    }
}
