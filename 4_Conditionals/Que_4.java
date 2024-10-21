import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Compare number which is bigger Enter a:");

        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();

        if (a>=b && a>=c) {
            System.out.println("a is bigger");
        } else if (b>=a && b>=c) {
            System.out.println("b is bigger");
        } else {
            System.out.println("c is bigger");
        }
    }
}
