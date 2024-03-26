package assign22_03_2024.assignment2;

abstract class Vehicle{
    public Vehicle(){

    }
    public abstract void run();
}
class Bike extends Vehicle {
    public Bike(){

    }
    public void run(){
        System.out.println("Bike running");
    }
}
class Car extends Vehicle{
    public Car(){

    }
    public void run(){
        System.out.println("Car running");
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        car.run();
        bike.run();
    }
}
