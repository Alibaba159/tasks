package com.company.Task2;

import java.util.Arrays;

/**
 * 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
 */
public class ElementMinusArithmeticMean {

    public static void resultMatrix(int[][] matrix) {
        System.out.println("ElementMinusArithmeticMean matrix result");
        for (int[] row:matrix
             ) {
            int arithmeticMean =arithmeticMean(row);
            for (int i=0;i<row.length;i++){
                row[i]=row[i]-arithmeticMean;
            }
            System.out.println(Arrays.toString(row));
        }
    }

    private static int arithmeticMean(int[] row) {
        int am = 0;
        for (int num : row) {
            am += num;
        }
        am = am / row.length;
        return am;
    }
}
