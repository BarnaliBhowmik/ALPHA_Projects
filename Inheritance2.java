public class Inheritance2 {
    public static void main(String args[]) {
        Fish nemo = new Fish();
        nemo.eat();
        nemo.swim();
        Mammal raja = new Mammal();
        raja.breathe();
        raja.walk();
        Bird siberian = new Bird();
        siberian.eat();
        siberian.breathe();
        siberian.fly();

    }
}

//Base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Raja walks like crane!");
    }
}

class Fish extends Animal{
    void swim() {
        System.out.println("Nemo loves Swimming!");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Siberian birds migrate North pole to South during winters!");
    }
}

