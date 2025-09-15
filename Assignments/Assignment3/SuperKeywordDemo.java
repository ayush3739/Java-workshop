package Assignments.Assignment3;

class Parent {
    String name = "Parent Class";

    void display() {
        System.out.println("This is parent class method.");
    }
}

class Child extends Parent {
    String name = "Child Class";

    void showNames() {
        // Access parent class variable
        System.out.println("Parent name: " + super.name);
        // Access child class variable
        System.out.println("Child name: " + name);
    }

    void display() {
        System.out.println("This is child class method.");
        // Call parent class method
        super.display();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showNames();
        obj.display();
    }
}
