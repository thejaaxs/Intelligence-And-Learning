// Employee Payroll Using Abstraction !

interface Employee5 {
    double calculateSalary();
}

class FullTimeEmployee5 implements Employee5 {
    double monthlySalary;

    public FullTimeEmployee5(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee5 implements Employee5 {
    double hourlyWage;
    int hoursWorked;
    int days;

    public PartTimeEmployee5(double hourlyWage, int hoursWorked, int days) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.days = days;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked * days;
    }
}

public class EmployeePayroll1 {
    public static void main(String[] args) {
        Employee5 e1 = new FullTimeEmployee5(1500000);
        System.out.println("Full Time Employee Salary : " + e1.calculateSalary());
        System.out.println("------------------------------------------");
        Employee5 e2 = new PartTimeEmployee5(1000, 7,10);
        System.out.println("Part Time Employee Salary : " + e2.calculateSalary());
    }
}