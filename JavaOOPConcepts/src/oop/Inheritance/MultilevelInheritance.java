package oop.Inheritance;

class Grandparent {
    void printGrandparent() {
        System.out.println("Grandparent class");
    }
}

class Parent1 extends Grandparent {
    void printParent1() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent1 {
    void printChild1() {
        System.out.println("Child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.printGrandparent(); // Calling grandparent class method
        c.printParent1();      // Calling parent class method
        c.printChild1();       // Calling child class method
    }
}
