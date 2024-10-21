import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the triangle first degree:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum == 180 && a>0 && b>0 && c>0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("invalid Triangle");
        }

    }
}
