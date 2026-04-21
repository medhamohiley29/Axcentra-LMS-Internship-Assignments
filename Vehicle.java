public class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
    public static void main(String[] args) {

        Vehicle v1 = new Car();   
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        System.out.println();

        v2.start();
        v2.stop();
    }
}
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key or button.");
    }

    @Override
    void stop() {
        System.out.println("Car stops using brakes.");
    }
}
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }

    @Override
    void stop() {
        System.out.println("Bike stops using hand brakes.");
    }
}
