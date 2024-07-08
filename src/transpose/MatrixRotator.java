package transpose;

public class MatrixRotator {

    public static int[][] rotateToNormal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] normalMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                normalMatrix[j][i] = matrix[i][j];
            }
        }

        return normalMatrix;
    }
}
