// Grid Ways Problem:
// Problem Statement: Given a grid of size 'n x m', you are initially positioned at the top-left corner of the grid.
// Your task is to find how many distinct ways you can move from the top-left corner to the bottom-right corner.
// You can only move in two directions: either to the right or downwards.

// Function Explanation:
// 1. `gridWays(i, j, n, m)` is a recursive function that computes the number of ways to reach the bottom-right corner (n-1, m-1)
//    from the current position (i, j).
// 2. Base case 1: If we reach the last cell `(n-1, m-1)`, we return 1, since it is a valid path.
// 3. Base case 2: If the current position `(i, j)` exceeds the boundaries of the grid, we return 0, since it's an invalid path.
// 4. Recursive case: The function calls itself by moving either right `(i, j+1)` or down `(i+1, j)` and adds up the number of ways from both directions.

// Sample Case: For a 3x3 grid, there are 6 possible ways to move from the top-left to the bottom-right corner.

public class Grid {
    
    // Recursive function to calculate number of ways
    public static int gridWays(int i, int j, int n, int m){
        // Base Case: If we've reached the bottom-right corner, return 1
        if(i == n-1 && j == m-1){ 
            return 1; 
        }
        // Boundary condition: If the current position exceeds grid limits, return 0
        else if(i == n || j == m){ 
            return 0; 
        }

        // Recursive call to move down and right
        int w1 = gridWays(i+1, j, n, m); // Move Down
        int w2 = gridWays(i, j+1, n, m); // Move Right

        // Return total number of ways by summing both possible paths
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3; // Define the grid dimensions
        
        // Output the total number of ways to traverse the grid from (0, 0) to (n-1, m-1)
        System.out.println(gridWays(0, 0, n, m));
    }
}
