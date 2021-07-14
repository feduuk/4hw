public class SumOfTwoMatrices extends MatrixDecorator {
    public SumOfTwoMatrices(MatrixImpl m1, MatrixImpl m2) throws ArrayIndexOutOfBoundsException {
        super(m1.addMatrices(m2));
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException, NullPointerException {
        return super.getElement(i, j);
    }
}
