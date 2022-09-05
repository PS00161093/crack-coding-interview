import java.util.Arrays;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column is set to 0.
 * Time Complexity: O(n)
 */
public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] arr = {{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        compress(arr);
    }

    private static void compress(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(matrix, i);
        }

        for (int j = 0; j < column.length; j++) {
            if (column[j]) nullifyColumn(matrix, j);
        }
    }

    static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    static void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

}
