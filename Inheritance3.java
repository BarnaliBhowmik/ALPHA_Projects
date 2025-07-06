public class Inheritance3 {
    public static void main(String args[]) {
        Fish nemo = new Fish();
        nemo.eat();
        nemo.swim();
        Tuna tn = new Tuna();
        tn.food();
        Shark sk = new Shark();
        sk.danger();
        Mammal raja = new Mammal();
        raja.breathe();
        raja.walk();
        Dog leo = new Dog();
        leo.bark();
        Cat mickey = new Cat();
        mickey.meow();
        Human jay = new Human();
        jay.chill();
        Bird siberian = new Bird();
        siberian.eat();
        siberian.breathe();
        siberian.fly();
        Peacock pk = new Peacock();
        pk.dance();

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
        System.out.println("> Raja walks like crane!");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("> Dog barks at intruders.");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("> Cat meows while getting a belly rub.");
    }
}

class Human extends Mammal {
    void chill() {
        System.out.println("> Humans enjoy weekend at beach.");
    }
}

class Fish extends Animal{
    void swim() {
        System.out.println("> Nemo loves Swimming!");
    }
}

class Tuna extends Fish {
    void food() {
        System.out.println("> We had tuna sandwich for breakfast.");
    }
}

class Shark extends Fish {
    void danger() {
        System.out.println("> Sharks are dangerous.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("> Siberian birds migrate North pole to South during winters!");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("> Mayilattam is an aesthetic and religious form of dance dedicated to Lord Subrahmanya that is performed at Hindu temples in Tamil Nadu and Kerala. Mayilattam dancers dress up as a peacock with a beak and execute specific dances while wearing costumes that can be opened and closed with a thread.The dancers are supported by a tall piece of wood at the end of their feet.");
    }
}