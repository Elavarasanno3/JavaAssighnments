package assign26_03_2024;
abstract class Shape{
    private double height;
    private double base;
    private double secondHeight;
    private double area;
    private double perimeter;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSecondHeight() {
        return secondHeight;
    }

    public void setSecondHeight(double secondHeight) {
        this.secondHeight = secondHeight;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    public Shape(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public Shape(double side) {
        this.base = side;
    }
    public Shape(double height, double base,double secondHeight) {
        this.height = height;
        this.base = base;
        this.secondHeight = secondHeight;
    }

    public abstract void area();
    public abstract void perimeter();

    public void viewArea(){
        System.out.println("area : " +  area);
    }
    public void viewPerimeter(){
        System.out.println("Perimeter : " + perimeter);
    }


}
class Square extends Shape{
    Square(double base ){
        super(base);
    }
    @Override
    public void area(){
        setArea(getBase()*getBase());
    }
    @Override
    public void perimeter(){
        setPerimeter(4*getBase());
    }
}

class Triangle extends Shape{
    Triangle(double base,double height,double secondHeight){
        super(base,height,secondHeight);
    }

    @Override
    public void area() {
        setArea(0.5*getBase()*getHeight());
    }

    @Override
    public void perimeter() {
        setPerimeter(getBase()+getHeight()+getSecondHeight());
    }
}
class Rectangle extends Shape{
    Rectangle(double base,double height){
        super(base,height);
    }

    @Override
    public void area() {
        setArea(getBase()*getHeight());
    }

    @Override
    public void perimeter() {
        setPerimeter(2 * (getBase()+getHeight()));
    }

}

class Circle extends Shape{
    Circle(double base){
        super(base);
    }

    @Override
    public void area() {
        setArea(Math.PI*(getBase()*getBase()));
    }

    @Override
    public void perimeter() {
        setPerimeter(2 * Math.PI*getBase());
    }

}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape square = new Square(5);
        square.area();
        square.perimeter();
        System.out.println("Square : ");
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("_____________________________________\n");

        Shape triangle = new Triangle(5,4,3);
        triangle.area();
        triangle.perimeter();
        System.out.println("Triangle : ");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println("______________________________________\n");

        Shape rectangle = new Rectangle(5,3);
        rectangle.area();
        rectangle.perimeter();
        System.out.println("Rectangle : ");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println("_______________________________________\n");

        Shape circle = new Circle(5);
        circle.area();
        circle.perimeter();
        System.out.println("Circle : ");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
