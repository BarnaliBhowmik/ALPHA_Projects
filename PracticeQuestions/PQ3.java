public class PQ3 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print(); // function overriding; prints print() of Car first

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class(Car)");
    }
}