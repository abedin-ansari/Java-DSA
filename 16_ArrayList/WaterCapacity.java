// Water Capacity Problem:
// Problem Statement: You are given an array `height[]`, where each element represents the height of a vertical line on the x-axis. 
// You need to find two lines such that, together with the x-axis, they form a container that can store the most water.
// Your task is to calculate the maximum water capacity that can be trapped between two lines.

// Solution Approach:
// 1. Brute Force Method (O(n^2)): For every pair of lines, calculate the water stored and find the maximum.
//    This approach is inefficient for large arrays as it takes O(n^2) time.
// 2. Optimized Approach using Two Pointers (O(n)): This is the more efficient solution. The two-pointer technique moves pointers towards the center, 
//    calculating the water area between them and updating the maximum water at each step.

import java.util.*;

public class WaterCapacity {

    // Optimized 2 Pointer Approach: O(n) time complexity
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0; // To store the maximum water area
        int lp = 0; // Left pointer starts at the beginning of the array
        int rp = height.size()-1; // Right pointer starts at the end of the array

        // Loop until the two pointers meet
        while(lp < rp){
            // Calculate water area between the two lines at the current pointer positions
            int ht = Math.min(height.get(lp), height.get(rp)); // The height is limited by the shorter line
            int width = rp - lp; // Width is the distance between the two lines
            int currWater = ht * width; // Calculate the water area

            // Update maximum water area if the current one is larger
            maxWater = Math.max(maxWater, currWater);

            // Move the pointer pointing to the shorter line inward
            if(height.get(lp) < height.get(rp)){
                lp++; // Move left pointer to the right
            } else{
                rp--; // Move right pointer to the left
            }
        }
        return maxWater; // Return the maximum water that can be stored
    }

    public static void main(String[] args) {
        // Example height array representing vertical lines
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Output the maximum water that can be stored
        System.out.println("Max Water Contained: " + storeWater(height) + " units"); // Expected output: 49
    }
}
