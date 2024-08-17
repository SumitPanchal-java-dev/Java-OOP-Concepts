package basics;

class Animal {
    String color = "White";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String color = "Brown";

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void sound() {
        super.sound(); // Calling parent class method
        System.out.println("Dog barks");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayColor();
        dog.sound();
    }
}
