import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to check weather its even or odd:");

        int number = sc.nextInt();

        if ( number%2 == 0 ) {
            System.out.println("Number is Even");
        } else {
            System.out.println("no. is odd");
        }
    }
}
