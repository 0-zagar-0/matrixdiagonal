package mate.academy;

import java.util.Arrays;

public class MatrixDiagonal {

  public int[] getDiagonal(int[][] matrix) {
    int[] diagonal = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++) {
        diagonal[i] = matrix[i][i];
    }
    return diagonal;
  }

  public int[] getCounterDiagonal(int[][] matrix) {
    int[] counterDiagonal = new int[matrix.length];
    int counter = matrix.length - 1;
    for (int i = 0; i < matrix.length; i++) {
      counterDiagonal[i] = matrix[i][counter];
      counter--;
    }
    return counterDiagonal;
  }
}
