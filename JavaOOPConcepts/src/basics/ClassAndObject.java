package basics;

class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", 2020);
        car1.displayDetails();

        Car car2 = new Car("Honda", 2018);
        car2.displayDetails();
    }
}
