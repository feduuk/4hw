public abstract class MatrixDecorator implements Matrix{
    Matrix m;

    public MatrixDecorator(Matrix m) {

        this.m = m;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException, NullPointerException {
        return m.getElement(i, j);
    }

    @Override
    public String toString() {
        if(m == null) return null;
        return m.toString();
    }
}
