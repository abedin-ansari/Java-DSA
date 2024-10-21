public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Object creation
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAcc bnk = new BankAcc(); // Encapsulation
        bnk.userName = "PNB";
        bnk.setPassword("wasss");
        System.out.println(bnk.userName);

        Student s1 = new Student(); // Default constructor

        Student s2 = new Student("AJ", 21); // Parameterized constructor
        System.out.println(s2.name);
        System.out.println(s2.age);

        Student s3 = new Student(s2); // Copy constructor
        System.out.println("Copy constr Name: " + s3.name);

        // for Single Level Inheritance example
        // Fish shark = new Fish();  // Single-Level Inheritance
        // shark.eat();  // Inherited method from Animal class

        // Multilevel Inheritance example
        // Cat whiteCat = new Cat();  // Multilevel Inheritance example
        // whiteCat.eat();  // Inherited from Animal
        // whiteCat.breed = "White Cat"; // Accessing child-specific property
        // System.out.println(whiteCat.breed); // Printing breed
        // whiteCat.legs = 4; // Accessing legs property from Mammal class
        // System.out.println(whiteCat.legs + " Legs"); // Printing number of legs

        Mammal goat = new Mammal(); // Hierarchical inheritance
        goat.breathe(); 
        goat.walk();
        Bird b1 = new Bird();
        b1.color = "Red";
        System.out.println(b1.color + " Bird");
        b1.eat();
        b1.fly();
        Fish f1 = new Fish();
        f1.eat();
        f1.swim();

        Shark ss1 = new Shark(); // Hybrid inheritance
        ss1.eyes = 2;
        System.out.println(ss1.eyes + " Shark Eyes");
        ss1.swim();
        Peacock pp1 = new Peacock();
        pp1.fly();
        pp1.wings = 2;
        System.out.println(pp1.wings + " Wings");
        Dog dd1 = new Dog();
        dd1.walk();
        dd1.tail = 1;
        System.out.println(dd1.tail + " Tail");
    }
}

// Class demonstrating encapsulation
class BankAcc {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

// Class with encapsulation (private fields, public methods)
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

// Class demonstrating different constructors
class Student {
    String name;
    int age;
    float percentage;

    void setPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }

    Student() { // Default constructor
        System.out.println("Default constructor...");
    }

    Student(String name, int age) { // Parameterized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s2) { // Copy constructor
        this.name = s2.name;
    }
}

// Base class for inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Single-Level Inheritance Example 
// class Fish extends Animal {  // Fish class inherits from Animal (Single-Level Inheritance)
//     int fins; // Fish-specific property

//     void swim() { // Fish-specific method
//         System.out.println("Swims in water");
//     }
// }

// Multilevel Inheritance Example 
// class Mammal extends Animal { // Mammal inherits from Animal
//     int legs; // Mammal-specific property
// }

// class Cat extends Mammal { // Cat inherits from Mammal (Multilevel Inheritance)
//     String breed; // Cat-specific property
// }

// Hierarchical inheritance
class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

// Hybrid inheritance
class Shark extends Fish {
    int eyes;
}

class Peacock extends Bird {
    int wings;
}

class Dog extends Mammal {
    int tail;
}
