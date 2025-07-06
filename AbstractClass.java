public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c= new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        //ANimal -> Horse -> Mustang

        // Animal a = new Animal(); beacuse we cannot objects in abstract class
    }
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }
    
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("> walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("> walks on 2 legs");
    }
}