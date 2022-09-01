/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * Time Complexity: O(n * n)
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(compress(arr));
    }

    private static boolean compress(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offSet = i - layer;
                int top = matrix[layer][i];
                matrix[layer][i] = matrix[last - offSet][layer];
                matrix[last - offSet][layer] = matrix[last][last - offSet];
                matrix[last][last - offSet] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        return true;
    }
    
}
