public class Logical {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){  // ( && -> if both sides are true then it will return true otherwise false )
        System.out.println("Hello");
        }
        if(z > y || z < x){  // ( || -> if one side is true then it will return true it is not neseccery both true for logical or ||)
        System.out.println("Java");
        }
        if((y+200) < x != (y+150) < z){ // ( ! -> logical not is (true if exp is false and vica verse)).
        System.out.println("Hello Java");
        }
    }
}
