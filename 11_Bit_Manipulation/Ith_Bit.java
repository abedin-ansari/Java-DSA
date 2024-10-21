import java.util.Scanner;

public class Ith_Bit {

    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;  // Left shift 1 by 'i' positions to create a bitmask for the i-th bit
        if((n & bitMask) == 0){
            return 0;  // If the AND operation results in 0, the i-th bit is 0
        } else {
            return 1;  // Otherwise, the i-th bit is 1
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;  // Left shift 1 by 'i' positions
        return n | bitMask;    // Use OR to set the i-th bit to 1
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);  // Create a bitmask with the i-th bit set to 0
        return n & bitMask;       // Use AND to clear the i-th bit
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, i); // If newBit is 0, clear the i-th bit
        } else{
            return setIthBit(n, i);   // If newBit is 1, set the i-th bit
        }
    }

    public static int lastIthBit(int n, int i){
        int bitMask = (~0) << i;  // Create a mask that has 1s from position 'i' to the left and 0s to the right
        return n & bitMask;       // Use AND to keep the bits from 'i' and higher, clearing all bits below
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0) << (j + 1));  // Clear bits from j+1 to the left
        int b = (1 << i) - 1;       // Clear bits to the right of i
        int bitMask = a | b;        // Combine the two masks to clear the range between i and j
        return n & bitMask;         // Clear bits in the range [i, j]
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the bit position to check/set/clear:");
        int i = sc.nextInt();
        
        System.out.println("The " + i + "-th bit of " + n + " is: " + getIthBit(n, i));
        System.out.println("After setting the " + i + "-th bit: " + setIthBit(n, i));
        System.out.println("After clearing the " + i + "-th bit: " + clearIthBit(n, i));
        System.out.println("After updating the " + i + "-th bit to 1: " + updateIthBit(n, i, 1));
        System.out.println("After updating the " + i + "-th bit to 0: " + updateIthBit(n, i, 0));

        System.out.println("After clearing all bits from the " + i + "-th bit and below: " + lastIthBit(n, i));
        System.out.println("Enter the range (i and j) to clear bits:");
        int j = sc.nextInt();
        System.out.println("After clearing bits from " + i + " to " + j + ": " + clearBitsInRange(n, i, j));
    }
}
