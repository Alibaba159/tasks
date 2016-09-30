package com.company.Task2.RandomMatrix_9;

/**
 * 9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
 */
public class CompactionMatrix {
    public static void compactOut(int[][] matrix, int width, int height) {
        MatrixSorting.sortByRows(matrix);
        for (int i=0;i<width;i++){
            for (int row0:matrix[i]) {
                if (row0==0){

                }
            }
        }
    }
}
