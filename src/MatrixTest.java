import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    public void getElementTest(){
        int matrix1[][] = {
                {1, 4, 3},
                {4, 9, 8},
                {2, 5, 1}
        };
        int matrix2[][] = {
                {3, 2, 9},
                {5, 1, 7},
                {6, 3, 2}
        };
        MatrixImpl m1 = new MatrixImpl(matrix1);
        MatrixImpl m2 = new MatrixImpl(matrix2);
        Matrix tm = new TransposedMatrix(m1);
        Matrix sotm = new SumOfTwoMatrices(m1, m2);
        assertEquals(9, m1.getElement(1,1));
        assertEquals(1, m2.getElement(1,1));
        assertEquals(9, tm.getElement(1,1));
        assertEquals(10, sotm.getElement(1,1));

    }
    @Test
    public void transposeTest(){
        int matrix1[][] = {
                {1, 4, 3},
                {4, 9, 8},
                {2, 5, 1}
        };
        MatrixImpl m1 = new MatrixImpl(matrix1);
        Matrix tm = new TransposedMatrix(m1);

        int transpMatrix[][] = {
                {1, 4, 2},
                {4, 9, 5},
                {3, 8, 1}
        };
        MatrixImpl transpM = new MatrixImpl(transpMatrix);

        assertEquals(transpM.toString(), m1.transpose().toString());
    }
    @Test
    public void sumOfTwoMatricesTest(){
        int matrix1[][] = {
                {1, 4, 3},
                {4, 9, 8},
                {2, 5, 1}
        };
        int matrix2[][] = {
                {3, 2, 9},
                {5, 1, 7},
                {6, 3, 2}
        };
        int matrix3[][] = {
                {4, 6, 12},
                {9, 10, 15},
                {8, 8, 3}
        };
        MatrixImpl m1 = new MatrixImpl(matrix1);
        MatrixImpl m2 = new MatrixImpl(matrix2);
        MatrixImpl m3 = new MatrixImpl(matrix3);
        assertEquals(m3.toString(), m1.addMatrices(m2).toString());
    }
    @Test
    public void ArrayIndexOutOfBoundsExceptionTest(){
        int matrix1[][] = {
                {1, 4},
                {4, 9, 8},
                {2, 5, 1}
        };

        int matrix2[][] = {
                {3, 2, 9},
                {5, 1, 7},
                {6, 3, 2}
        };
        MatrixImpl m1 = new MatrixImpl(matrix1);
        MatrixImpl m2 = new MatrixImpl(matrix2);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> new TransposedMatrix(m1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> new SumOfTwoMatrices(m1,  m2));
    }
    @Test
    public void NullPointerExceptionTest(){
        int matrix1[][] = null;

        int matrix2[][] = {
                {3, 2, 9},
                {5, 1, 7},
                {6, 3, 2}
        };
        MatrixImpl m1 = new MatrixImpl(matrix1);
        MatrixImpl m2 = new MatrixImpl(matrix2);
        assertThrows(NullPointerException.class, () -> new TransposedMatrix(m1));
        assertThrows(NullPointerException.class, () -> new SumOfTwoMatrices(m1,  m2));

    }
}