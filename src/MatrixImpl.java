public class MatrixImpl implements Matrix{

    private final int[][] matrix;

    public MatrixImpl(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement (int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrix[i][j];
    }
    public int length(){
        return matrix.length;
    }
    public int length(int i){
        return matrix[i].length;
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
