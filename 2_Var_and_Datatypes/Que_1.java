// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
//              these 3 numbers.

// Solution - Average of 3 numbers

import java.util.*;
public class Que_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers (A, B, C) separated by spaces:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);
        sc.close();
    }
}
