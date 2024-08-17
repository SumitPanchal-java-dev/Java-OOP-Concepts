package oop.Abstraction;

abstract class Shape {
    abstract void draw(); // Abstract method

    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s1.display();

        s2.draw();
        s2.display();
    }
}
