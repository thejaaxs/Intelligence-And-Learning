package OOPS;

class Shapes {
    public void draw() {
        System.out.println("Drawing a Shape !");
    }
}

class circle extends Shapes {
    public void draw() {
        System.out.println("Drawing a Circle !");
    }
}

class Rectangle extends Shapes {
    public void draw() {
        System.out.println("Drawing a Rectangle !");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }
}

public class Polymorphism2 {
    public static void main(String args[]) {
        Shapes s = new Shapes();
        s.draw();
        Shapes cir = new circle();
        cir.draw();
        Shapes rect = new Rectangle();
        rect.draw();
        Calculator c = new Calculator();
        System.out.println("Addition of 2 Numbers : " + c.add(1, 2));
        System.out.println("Float of 3 Numbers : " + c.add(10.5f, 10.5f, 10.0f));
    }
}
