// Pattern Problem 3.

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number :");
        int n = sc.nextInt();
        int trows = n;

        int star = 1;

        for(int row = 1; row <= trows; row++){

            for(int cst = 1; cst<=star; cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row <= trows/2){
                star++;
            } else {
                star--;
            }
        }
    }
}
