package com.company.Task2;

import java.util.Arrays;

/**
 * вывод матрицы
 */
public class MatrixOut {
    public static void Out(int[][] matrix) {
        for (int[] row : matrix
                ) {
            System.out.println(Arrays.toString(row));
        }
    }
}
