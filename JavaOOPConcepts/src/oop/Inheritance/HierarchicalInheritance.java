package oop.Inheritance;

class Base {
    void showBase() {
        System.out.println("Base class method");
    }
}

class Derived1 extends Base {
    void showDerived1() {
        System.out.println("Derived1 class method");
    }
}

class Derived2 extends Base {
    void showDerived2() {
        System.out.println("Derived2 class method");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();

        d1.showBase();
        d1.showDerived1();

        d2.showBase();
        d2.showDerived2();
    }
}
