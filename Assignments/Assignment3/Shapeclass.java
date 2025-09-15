package Assignments.Assignment3;
class Shape {
    public double area() {
        System.out.println("Area not defined.");
        return 0;
    }
}
class Circle extends Shape {
    int radius;
    public Circle(int r) {
        radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    int length, breadth;
    public  Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}
public class Shapeclass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}
