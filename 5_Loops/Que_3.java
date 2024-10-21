// finding the Prime number.

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to check its prime or not:");

        int n = sc.nextInt();

        int div = 2;
        int flag = 0;

        while(div <= n-1){

          if(n % div == 0){
            flag = 1;
            break;
          }
            div += 1;
        }
        if(flag == 1){
            System.out.println("not a prime number");
        } else {
            System.out.println("Prime number");
        }
    }
}
