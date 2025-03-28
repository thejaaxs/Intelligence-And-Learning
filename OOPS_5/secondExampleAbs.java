// Employee Management Using OOPS

interface Employee6 {
    double calculateSalary();
}

class FullTimeEmployee6 implements Employee6 {
    private double monthlySalary;

    // Corrected constructor name
    FullTimeEmployee6(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee6 implements Employee6 {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee6(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class secondExampleAbs {
    public static void main(String[] args) {
        Employee6 man = new FullTimeEmployee6(60000);
        System.out.println("Full Time Employee Salary: " + man.calculateSalary());

        Employee6 partTimeWorker = new PartTimeEmployee6(20, 80);
        System.out.println("Part Time Employee Salary: " + partTimeWorker.calculateSalary());
    }
}