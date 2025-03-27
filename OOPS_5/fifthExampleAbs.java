// Vehicle Management Using OOPS

interface Vehicle5 {
    void start();

    void stop();

    String fuelType();
}

class Car5 implements Vehicle5 {
    @Override
    public void start() {
        System.out.println("Car is Starting !");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping !");
    }

    @Override
    public String fuelType() {
        return "Petrol/Diesel";
    }
}

class Bike5 implements Vehicle5 {
    @Override
    public void start() {
        System.out.println("Bike is Starting !");
    }

    @Override
    public void stop() {
        System.out.println("Bike is Stopping !");
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}

public class fifthExampleAbs {
    public static void main(String[] args) {
        Vehicle5 bike = new Bike5();
        bike.start();
        bike.stop();
        System.out.println("Bike Fuel Type : " + bike.fuelType());
        System.out.println("--------------------------------------------");
        Car5 car = new Car5();
        car.start();
        car.stop();
        System.out.println("Car Fuel Type : " + car.fuelType());
    }
}
