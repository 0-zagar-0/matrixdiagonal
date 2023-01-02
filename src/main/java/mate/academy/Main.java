package mate.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
        int[][] matrix = {
                {-2, 31, 6, 7},
                {15, -42, 1, 0},
                {9, -7, 12, 19},
                {55, 34, 1, -10}
        };

        int[] diagonal = matrixDiagonal.getDiagonal(matrix);
        System.out.println(Arrays.toString(diagonal));

        int[] counterDiagonal = matrixDiagonal.getCounterDiagonal(matrix);
        System.out.println(Arrays.toString(counterDiagonal));
    }
}
