public class MatrixOperations {
    public static int[][] mutliplyMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            return null;
        }
        int[][] result = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    // matrixA[0][0] * matrixB[0][0]
                    // matrixA[0][1] * matrixB[1][0]
                    // ^^ [0][1] represents the 2nd column of the first row, [1][0] represents the
                    // 1st column of the 2nd row
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
}
