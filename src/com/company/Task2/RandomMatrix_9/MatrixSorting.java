package com.company.Task2.RandomMatrix_9;

import com.company.Task2.MatrixOut;

import java.util.Arrays;

/**
 * 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
 */
public class MatrixSorting {
    public static int[][] sortByRows(int[][] matrix) {
        System.out.println("Sorting rows");
        for (int[] row : matrix
                ) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
        }
        return matrix;
    }

    public static int[][] sortByColumn(int[][] matrix, int width, int height) {
        System.out.println("Sorting column");
        int i, j, k, tmp;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width - 1; j++) {
                for (k = 1; k < width - j; k++) {
                    if (matrix[k - 1][i] > matrix[k][i]) {
                        tmp = matrix[k - 1][i];
                        matrix[k - 1][i] = matrix[k][i];
                        matrix[k][i] = tmp;
                    }
                }
            }
        }
        MatrixOut.Out(matrix);
        return matrix;
    }
}
