// 1st Question -
// This program solves the n-Queens problem and finds one solution for n=5.
// It checks if placing a queen at a given row and column is safe.
// If safe, it places the queen and proceeds to the next row.
// If a solution is found, the chess board is printed, otherwise it prints "Solution not possible".

public class Queen {
    public static boolean isSafe(char[][] board, int row, int col){
        // vertical up 
        for(int i = row-1; i >=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal right up
        for(int i = row-1, j = col+1; i>= 0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char[][] board, int row){
        // Base Case
        if(row == board.length){
            // printArr(board);
            return true;
        }
        // Column Loop
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){ // Function call
                    return true;
                } 
                board[row][j] = '.'; // Backtracking step
            }
        }
        return false;
    }
    public static void printArr(char[][] board) {
        System.out.println("------ Chess Board -----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        char[][] board = new char[n][n];
        // initialize
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is Possible");
            printArr(board);
        } else{
            System.out.println("Solution not Possible");
        }
    }
}


// 2nd Question
// This program solves the n-Queens problem by counting all possible solutions for n=5.
// It uses recursion and backtracking to try all possible configurations of queens on the board.
// If a valid configuration is found, the count is incremented.

// public class Queen {
//     public static boolean isSafe(char[][] board, int row, int col){
//         // vertical up 
//         for(int i = row-1; i >=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         // diagonal left up
//         for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         // diagonal right up
//         for(int i = row-1, j = col+1; i>= 0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char[][] board, int row){
//         // Base Case
//         if(row == board.length){
//             // printArr(board);
//             count++;
//             return;
//         }
//         // Column Loop
//         for(int j = 0; j < board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1); // Function call
//                 board[row][j] = '.'; // Backtracking step
//             }
//         }
//     }
//     public static void printArr(char[][] board) {
//         System.out.println("------ Chess Board -----");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     static int count = 0;
//     public static void main(String[] args) {
//         int n=5;
//         char[][] board = new char[n][n];
//         // initialize
//         for(int i = 0; i < n ; i++){
//             for(int j = 0; j < n; j++){
//                 board[i][j] = '.';
//             }
//         }
//         nQueens(board, 0);
//         System.out.println("Total no. of ways to solve n Queens: " + count);
//     }
// }

// 3rd Question -
// This program solves the n-Queens problem by printing all solutions for n=4.
// It uses recursion and backtracking to explore all possible configurations of queens on the board.
// Each valid solution is printed as a chess board configuration.

// public class Queen {
//     public static boolean isSafe(char[][] board, int row, int col){
//         // vertical up 
//         for(int i = row-1; i >=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         // diagonal left up
//         for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         // diagonal right up
//         for(int i = row-1, j = col+1; i>= 0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char[][] board, int row){
//         // Base Case
//         if(row == board.length){
//             printArr(board);
//             return;
//         }
//         // Column Loop
//         for(int j = 0; j < board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1); // Function call
//                 board[row][j] = '.'; // Backtracking step
//             }
//         }
//     }
//     public static void printArr(char[][] board) {
//         System.out.println("------ Chess Board -----");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int n=4;
//         char[][] board = new char[n][n];
//         // initialize
//         for(int i = 0; i < n ; i++){
//             for(int j = 0; j < n; j++){
//                 board[i][j] = '.';
//             }
//         }
//         nQueens(board, 0);
//     }
// }
