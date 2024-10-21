import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. :");
        int n = sc.nextInt();

        int a = 0;
        int b = 1; // these two are initial fibonacci values

        int count = 1;

        while(count < n+1){
            System.out.println(a);

            int sum = a+b;
            a=b;
            b=sum;

            count = count + 1;
        }

    }
}
