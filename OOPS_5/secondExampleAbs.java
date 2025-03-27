interface Employee6 {
    double calculateSalary();
}

class FullTimeEmployee5 implements Employee6 {
    private double monthlySalary;

    // Corrected constructor name
    FullTimeEmployee5(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee5 implements Employee6 {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee5(double hourlyRate, int hoursWorked) {
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
        Employee6 man = new FullTimeEmployee5(60000);
        System.out.println("Full Time Employee Salary: " + man.calculateSalary());

        Employee6 partTimeWorker = new PartTimeEmployee5(20, 80);
        System.out.println("Part Time Employee Salary: " + partTimeWorker.calculateSalary());
    }
}