import java.util.Scanner;

public class ParaVsArg {
    public static int calc(int num1, int num2){   // Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calc(a, b);                    // Arguments
        System.out.println("Sum is:" + sum);
    }
}
