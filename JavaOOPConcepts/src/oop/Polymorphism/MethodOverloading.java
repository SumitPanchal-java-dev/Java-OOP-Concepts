package oop.Polymorphism;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    // Overloading add method
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of two numbers: " + math.add(10, 20));
        System.out.println("Sum of three numbers: " + math.add(10, 20, 30));
    }
}
