public abstract class MatrixDecorator implements Matrix{
    Matrix m;

    public MatrixDecorator(Matrix m) {

        this.m = m;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return m.getElement(i, j);
    }

    @Override
    public int length(){
        return m.length();
    }
    @Override
    public int length(int i){
        return m.length(i);
    }

    @Override
    public String toString() {
        if(m == null) return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m.length(); i++){
            for(int j = 0; j < m.length(i); j++){
                sb.append(getElement(i, j) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
