package com.company.Task2.RandomMatrix_9;

import com.company.Task2.MatrixOut;

import java.util.Arrays;

/**
 * 9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
 */
public class TurnMatrix {
    public static int[][] turn90(int[][] matrix, int width, int height) {
        if (width == height) {
            for (int i = 0; i < width / 2; i++) {
                for (int j = i; j < width - 1 - i; j++) {
                    int x = matrix[i][j];
                    matrix[i][j] = matrix[j][width - 1 - i];
                    matrix[j][width - 1 - i] = matrix[width - 1 - i][width - 1 - j];
                    matrix[width - 1 - i][width - 1 - j] = matrix[width - 1 - j][i];
                    matrix[width - 1 - j][i] = x;
                }
            }
            MatrixOut.Out(matrix);
        } else System.out.println("Enter sizes for Square matrix");
        return matrix;
    }
}
