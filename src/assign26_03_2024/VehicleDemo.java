package assign26_03_2024;
abstract class Vehicle{
    public abstract void start();
    public abstract void stop();
}
class Bike extends Vehicle{

    @Override
    public void start() {
        System.out.println("Bike starting ");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopping");
    }
}
class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("Car Starting");

    }

    @Override
    public void stop() {
        System.out.println("Car Stopping ");
    }
}
class Aeroplane extends Vehicle{

    @Override
    public void start() {
        System.out.println("Aeroplane Starting");
    }

    @Override
    public void stop() {
        System.out.println("Aeroplane Stopping ");
    }
}
class BullockCart extends Vehicle{

    @Override
    public void start() {
        System.out.println("BullockCart Starting");
    }

    @Override
    public void stop() {
        System.out.println("BullockCart Stopping ");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle aeroplane = new Aeroplane();
        aeroplane.start();
        aeroplane.stop();
        Vehicle bullockCart = new BullockCart();
        bullockCart.start();
        bullockCart.stop();

    }
}
