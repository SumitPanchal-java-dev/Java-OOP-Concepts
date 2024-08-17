package basics;

class Employee {
    String name;
    int id;

    // Using 'this' to refer to instance variables
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee Name: " + this.name + ", ID: " + this.id);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 101);
        emp.showDetails();
    }
}
