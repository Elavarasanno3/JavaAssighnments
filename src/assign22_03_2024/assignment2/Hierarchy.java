package assign22_03_2024.assignment2;
abstract class Shape {

    public Shape() {
        // Common constructor logic for all shapes (optional)
    }

    public abstract double area(); // Abstract method for calculating area

}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}

public class Hierarchy {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Circle Area : " + circle.area());
        System.out.println("Rectangle Area : " + rectangle.area());
    }
}
