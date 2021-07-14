public class TransposedMatrix extends MatrixDecorator {
    public TransposedMatrix(MatrixImpl m) throws ArrayIndexOutOfBoundsException {
        super(m.transpose());
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException, NullPointerException{

        return super.getElement(i, j);
    }
}
