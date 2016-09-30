package com.company.Task2;

import java.util.Arrays;

/**
 * 9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
 */
public class ZeroToEnd {
    public static void resultOut(int[][] matrix, int height) {
        int i, j;
        for (int[] row : matrix
                ) {
            for (i = 0; i < height - 1; i++) {
                for (j = 1; j < height - i; j++) {
                    if (row[j - 1] == 0) {
                        row[j - 1] = row[j];
                        row[j] = 0;
                    }
                }
            }
        }
        System.out.println("rez");
        for (int[] w : matrix
                ) {
            System.out.println(Arrays.toString(w));
        }
    }
}
