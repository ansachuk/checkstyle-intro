import hw.oop.MatrixDiagonal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {4, 5, 6}, {1, 1, 1}};

        int[] diagonal = MatrixDiagonal.getDiagonal(matrix);
        int[] counterDiagonal = MatrixDiagonal.getCounterDiagonal(matrix);

        System.out.println("diagonal = " + Arrays.toString(diagonal));
        System.out.println("counterDiagonal = " + Arrays.toString(counterDiagonal));
    }
}