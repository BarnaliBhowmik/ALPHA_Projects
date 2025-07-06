public class Inheritance1 {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
    int legs;
}

class Dog extends Mammal {
    String breed;
}

//Derived class / subclass
class Fish extends Animal{
    int fins;

    void swim() {
        System.out.println("swims in water.");
    }
}
