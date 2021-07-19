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
        Matrix m1 = new MatrixImpl(matrix1);
        assertEquals(9, m1.getElement(1,1));
    }

    @Test
    public void getElementFromTransposedTest(){
        int matrix1[][] = {
                {1, 4, 3},
                {4, 9, 8},
                {2, 5, 1}
        };
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix tm = new TransposedMatrix(m1);
        assertEquals(9, tm.getElement(1,1));
    }

    @Test
    public void getElementFromSumOfTwoTest(){
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
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix m2 = new MatrixImpl(matrix2);
        Matrix sotm = new SumOfTwoMatrices(m1, m2);
        assertEquals(10, sotm.getElement(1,1));
    }

    @Test
    public void transposedToStringTest(){
        int matrix1[][] = {
                {1, 4, 3},
                {4, 9, 8},
                {2, 5, 1}
        };
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix tm = new TransposedMatrix(m1);

        int transpMatrix[][] = {
                {1, 4, 2},
                {4, 9, 5},
                {3, 8, 1}
        };
        Matrix transpM = new MatrixImpl(transpMatrix);

        assertEquals(transpM.toString(), tm.toString());
    }

    @Test
    public void sumOfTwoToStringTest(){
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
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix m2 = new MatrixImpl(matrix2);
        Matrix sumM = new SumOfTwoMatrices(m1, m2);

        int matrix3[][] = {
                {4, 6, 12},
                {9, 10, 15},
                {8, 8, 3}
        };
        Matrix m3 = new MatrixImpl(matrix3);

        assertEquals(m3.toString(), sumM.toString());
    }

    @Test
    public void getLengthTransposedTest(){
        int matrix1[][] = {
                {1, 4},
                {4, 9},
                {2, 5}
        };
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix tm = new TransposedMatrix(m1);
        assertEquals(2, tm.length());
        assertEquals(3, tm.length(0));
    }

    @Test
    public void getLengthSumOfTwoTest(){
        int matrix1[][] = {
                {1, 4},
                {4, 9},
                {2, 5}
        };
        int matrix2[][] = {
                {1, 4},
                {4, 9},
                {2, 5}
        };
        Matrix m1 = new MatrixImpl(matrix1);
        Matrix m2 = new MatrixImpl(matrix2);
        Matrix sumM = new SumOfTwoMatrices(m1, m2);
        assertEquals(3, sumM.length());
        assertEquals(2, sumM.length(0));
    }


}