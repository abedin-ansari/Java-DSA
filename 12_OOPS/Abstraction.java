public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse(); // Concrete class implementing abstract methods
        h1.eat(); // Inherited non-abstract method
        h1.walk(); // Abstract method implemented in Horse class
        System.out.println(h1.color);
        
        Chicken c1 = new Chicken(); // Another concrete class implementing the abstract method
        c1.eat(); 
        c1.walk();

        Mustang m1 = new Mustang(); // Multilevel inheritance example
    }
}

// Abstract class with both abstract and concrete methods
abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }

    void eat() { // Concrete method
        System.out.println("Animal eats");
    }

    abstract void walk(); // Abstract method
}

// Concrete subclass providing implementation of abstract method
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("Walks with 4 legs");
    }
}

// Multilevel inheritance: Mustang inherits from Horse
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called");
    }
}

// Another concrete subclass implementing the abstract method
class Chicken extends Animal {
    void changeColor() {
        color = "Black";
    }

    void walk() {
        System.out.println("Walks on two legs");
    }
}
