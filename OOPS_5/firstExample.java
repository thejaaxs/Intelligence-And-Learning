// Animal Sound Using OOPS

abstract class Animal5 {
    abstract void makesSound();
}

class Dog5 extends Animal5 {
    @Override
    public void makesSound() {
        System.out.println("Dog Barks WOOF WOOF !");
    }
}

class Cat5 extends Animal5 {
    @Override
    public void makesSound() {
        System.out.println("Cat Meows MEOW MEOW !");
    }
}

public class firstExample {
    public static void main(String args[]) {
        Animal5 dog = new Dog5();
        dog.makesSound();
        Animal5 cat = new Cat5();
        cat.makesSound();
    }
}
