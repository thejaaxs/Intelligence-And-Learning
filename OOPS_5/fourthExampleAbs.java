// Shape Area Calculation Using OOPS

abstract class Shape5 {
    abstract double calculateArea();
}

class Circle5 extends Shape5 {
    private double radius;

    Circle5(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle5 extends Shape5 {
    private double length;
    private double breadth;

    public Rectangle5(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class fourthExampleAbs {
    public static void main(String[] args) {
        Shape5 rect = new Rectangle5(10, 5);
        System.out.println("Area of the Rectangle is : " + rect.calculateArea());
        Shape5 circ = new Circle5(10);
        System.out.println("Area of the Circle is " + circ.calculateArea());
    }
}
