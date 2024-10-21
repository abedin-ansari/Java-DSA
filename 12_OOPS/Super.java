public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
class Animal {
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal {
    Horse(){
        super.color = "White";
        System.out.println("Horse constr called");
    }
}
