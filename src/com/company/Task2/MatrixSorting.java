package com.company.Task2;

import java.util.Arrays;

/**
 * 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
 */
public class MatrixSorting {
    public static void sort(int[][] matrix, int width, int height) {
        System.out.println("Sorting rows");
        for (int[] row:matrix
             ) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
        }
       /* System.out.println("Sorting column");
        int i,j,k=0,tmp=0;
        for (i=0;i<width;i++){
            for (j=i+1;j<width;j++){
                for ()



            }
        }*/
    }
}
