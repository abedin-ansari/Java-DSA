// Import java.util.Arrays:
// Arrays.deepToString() is part of the java.util.Arrays class.

// Using Arrays.deepToString():
// System.out.println(Arrays.deepToString(result)) converts the 2D array result into a string that shows
// the array in a readable, nested format.

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 4, 9},
            {5, 8, 2, 6},
            {1, 3, 7, 2},
        };
        
        // Option 1: Using Arrays.deepToString()
        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result));

        // Option 2: Using nested loops to print the matrix
        // for (int i = 0; i < result.length; i++) {
        //     for (int j = 0; j < result[i].length; j++) {
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
    }

    public static int[][] transpose(int[][] matr){
            int rows = matr.length; // rows
            int cols = matr[0].length; // columns

            int ans[][] = new int[cols][rows];

            for(int i = 0; i < rows; i++){

                for(int j = 0; j < cols; j++){
                    ans[j][i] = matr[i][j];
                }
            }
            return ans;
    }
}