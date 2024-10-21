// The outer loop iterates over columns (c from 0 to the number of columns).
// For each column:
// If the column index c is even, it prints the elements from top to bottom (moves down).
// If the column index c is odd, it prints the elements from bottom to top (moves up).

// Move Down Loop
//
// for(int r = 0; r < arr.length; r++) {
//     System.out.println(arr[r][c] + ", ");
// }
//
// Initialization: int r = 0 sets the starting value of r to 0.
// Condition: r < arr.length ensures that the loop continues as long as r is less than the number of rows in the array.
// Update: r++ increments r by 1 after each iteration.
// This loop iterates over each row from top to bottom for the current column c.

// Move Up Loop
//
// for(int r = arr.length - 1; r >= 0; r--) {
//     System.out.println(arr[r][c] + ", ");
// }
//
// Initialization: int r = arr.length - 1 sets the starting value of r to the last row index. ***
// Condition: r >= 0 ensures that the loop continues as long as r is greater than or equal to 0.
// Update: r-- decrements r by 1 after each iteration.

public class WaveDisplay {
    public static void main(String[] args) {
        // int[][] nums = new int[3][3];

        int[][] nums = {
            {1, 2, 7},
            {3, 4, 9},
            {5, 6, 11}
        };
        waveDisplay(nums);  // waveDisplay(nums) is called with the 2D array as an argument.
    }
    public static void waveDisplay(int[][] arr){  // waveDisplay method takes a 2D array arr as an argument

        for(int c = 0; c < arr[0].length; c++){

            if( c%2 == 0){
                //move down
                for(int r = 0; r < arr.length; r++){
                    System.out.println(arr[r][c] + ", ");
                }
            } else {
                // move up
                for(int r = arr.length - 1; r >= 0; r--){
                    System.out.println(arr[r][c] + ", ");
                 
                }
            }
        }
    }
}
