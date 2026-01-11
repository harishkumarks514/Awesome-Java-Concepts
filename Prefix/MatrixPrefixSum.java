package Prefix;

public class MatrixPrefixSum {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] prefix = new int[rows][cols];

        // Build prefix matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int up = (i > 0) ? prefix[i - 1][j] : 0;
                int left = (j > 0) ? prefix[i][j - 1] : 0;
                int diagonal = (i > 0 && j > 0) ? prefix[i - 1][j - 1] : 0;

                prefix[i][j] = matrix[i][j] + up + left - diagonal;
            }
        }

        // Query sum of submatrix (1,1) to (2,2)
        int r1 = 1, c1 = 1;
        int r2 = 2, c2 = 2;

        int sum = prefix[r2][c2]
                - (r1 > 0 ? prefix[r1 - 1][c2] : 0)
                - (c1 > 0 ? prefix[r2][c1 - 1] : 0)
                + (r1 > 0 && c1 > 0 ? prefix[r1 - 1][c1 - 1] : 0);

        System.out.println("Submatrix sum = " + sum);
    }
}