public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal t = new Animal();
        t.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Tiger can eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer only eats grass");
    }
}