import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks out of 100 to find pass or failed:");

        int marks = sc.nextInt();

        String result = (marks > 33) ? "Pass" : "Failed";

        System.out.print(result);
    }
}
