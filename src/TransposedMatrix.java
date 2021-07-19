public class TransposedMatrix extends MatrixDecorator {
    public TransposedMatrix(MatrixImpl m) throws ArrayIndexOutOfBoundsException {
        super(m);
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException{

        return super.getElement(j, i);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
