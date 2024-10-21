import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year to check its a leap year or not:");

        int year = sc.nextInt();

        if ( (year%4 == 0) && (year%100 != 0) || (year%400 == 0) ) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
