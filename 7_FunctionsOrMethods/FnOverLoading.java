import java.util.Scanner;

public class FnOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integers to perform addition :");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter decimal value to add perform addition :");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        
        calc(a, b);
        
        double res2 = calc(c, d);
        System.out.println("Adding of doubles is: " + res2);
    }

    public static void calc(int a, int b){
         System.out.println("Adding of integers are:" + (a+b));
    }

    public static double calc(double a, double b){

        double sum = a+b;
        return sum;
        //  System.out.println("float sum are:" + a+b);
    }
}
