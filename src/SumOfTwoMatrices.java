public class SumOfTwoMatrices extends MatrixDecorator {
    Matrix m2;
    public SumOfTwoMatrices(Matrix m1, Matrix m2) throws ArrayIndexOutOfBoundsException {
        super(m1);
        this.m2 = m2;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return super.getElement(i, j) + m2.getElement(i, j);
    }

    @Override
    public String toString() {
        if(m2 == null) return null;
        return super.toString();
    }
}
