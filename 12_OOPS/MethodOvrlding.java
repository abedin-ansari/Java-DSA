// Compile Time "Polymorphism"
public class MethodOvrlding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum((float)3.0, (float)2.0));
        System.out.println(calc.sum(3, 3, 4));

        // System.out.println(sum(2 + 2));
        // System.out.println(sum((float)3.0 + (float)2.0));
        // System.out.println(sum(3 + 3 + 4));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
