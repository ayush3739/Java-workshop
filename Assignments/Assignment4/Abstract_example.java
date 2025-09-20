package Assignments.Assignment4;
// Abstract class
abstract class Shape {
    abstract void numberOfSides();
}

// Trapezoid
class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides.");
    }
}

// Triangle
class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

// Hexagon
class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}


public class Abstract_example {
    
    public static void main(String[] args) {
        Shape s;

        s = new Trapezoid();
        s.numberOfSides();

        s = new Triangle();
        s.numberOfSides();

        s = new Hexagon();
        s.numberOfSides();
        
    }
}
