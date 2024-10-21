import java.util.Scanner;

public class OddEven {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check weather its odd or even: ");
        int n = sc.nextInt();
        OddOrEven(n);
    }
}
