import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1st Name: ");
        // String name = sc.next();   //   It Takes only single Word.
        // System.out.print("Enter 2nd Name: ");
        String name2 = sc.nextLine();  // It takes full line.
        System.out.print("2nd Name is: " + name2);
    }
}