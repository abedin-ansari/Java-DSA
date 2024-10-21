// Pattern problem - 1.

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. for how many lines of star will be :");
        int n = sc.nextInt();
        int trows = n; // Total Rows.

        for(int row = 0; row <= trows; row++){

            for(int cst = 1; cst <= row; cst++){   // cst = count of stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
