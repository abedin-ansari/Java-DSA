import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int[][] result = rotate(matrix);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] rotate(int[][] mtrx){
        int n = mtrx.length;

        // 1st process - Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mtrx[i][j];
                mtrx[i][j] = mtrx[j][i];
                mtrx[j][i] = temp;
            }
        }

        // 2nd process - Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mtrx[i][j];
                mtrx[i][j] = mtrx[i][n - j - 1];
                mtrx[i][n - j - 1] = temp;
            }
        }

        return mtrx;
    }
}
