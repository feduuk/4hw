public class TransposedMatrix extends MatrixDecorator {
    public TransposedMatrix(Matrix m) throws ArrayIndexOutOfBoundsException {
        super(m);
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException{

        return super.getElement(j, i);
    }

    @Override
    public int length(){
        return super.length(0);
    }
    @Override
    public int length(int i){
        return super.length();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
