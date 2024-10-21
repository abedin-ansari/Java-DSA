// Method Overriding (Run time "Polymorphism")

public class MethodOvrriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}

