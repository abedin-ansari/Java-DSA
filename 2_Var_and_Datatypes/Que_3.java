// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//            an eraser. You have to output the total cost of the items back to the user as their bill.

// Solution - Bill of Items

import java.util.*;
public class Que_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of a pencil:");
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of a pen:");
        float pen = sc.nextFloat();

        System.out.println("Enter the price of an eraser:");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        float newTotal = total + (0.18f * total);   //Add on - with 18% GST
        System.out.println("Bill with 18% GST : " + newTotal);
        sc.close();
    }
}