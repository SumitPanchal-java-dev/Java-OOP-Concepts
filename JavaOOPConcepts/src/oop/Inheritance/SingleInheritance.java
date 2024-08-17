package oop.Inheritance;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();    // Calling parent class method
        c.display(); // Calling child class method
    }
}
