// Question 2: In a program, input the side of a square. You have to output the area of the
//             square.

// Solution - Area of a Square

import java.util.*;
public class Que_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length of the square:");
        int side = sc.nextInt();
        int area = side * side;

        System.out.println("area of the square is : " + area);
        sc.close();
    }
}