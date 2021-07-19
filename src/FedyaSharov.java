import java.util.Arrays;

public class FedyaSharov {

    public static void main(String[] args) {

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
        System.out.println("First matrix:");
        System.out.println(m1);

        Matrix m2 = new MatrixImpl(matrix2);
        System.out.println("Second matrix:");
        System.out.println(m2);

        Matrix tm = new TransposedMatrix(m1);
        System.out.println("Transposed matrix:");
        System.out.println(tm);


        Matrix sotm = new SumOfTwoMatrices(m1,  m2);
        System.out.println("Sum of two matrices:");
        System.out.println(sotm);


        System.out.println("Elements:");
        System.out.println(m1.getElement(1,2));
        System.out.println(m2.getElement(1,2));
        System.out.println(tm.getElement(1,2));
        System.out.println(sotm.getElement(1,2));

    }
}
