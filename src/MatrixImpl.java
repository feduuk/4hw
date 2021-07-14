public class MatrixImpl implements Matrix{

    private final int[][] matrix;

    public MatrixImpl(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix addMatrices(Matrix m) throws ArrayIndexOutOfBoundsException, NullPointerException {
        //need exception
        int[][] sumOfMatrices = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sumOfMatrices[i][j] = matrix[i][j] + m.getElement(i, j);
            }
        }
        return new MatrixImpl(sumOfMatrices);
    }
    public Matrix transpose() throws ArrayIndexOutOfBoundsException, NullPointerException {
        //need exception
        int [][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return new MatrixImpl(transposedMatrix);
    }

    @Override
    public int getElement (int i, int j) throws ArrayIndexOutOfBoundsException, NullPointerException {
        return matrix[i][j];
    }

    @Override
    public String toString(){
        if(matrix == null) return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sb.append(matrix[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
