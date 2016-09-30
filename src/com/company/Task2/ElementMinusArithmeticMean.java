package com.company.Task2;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
 */
public class ElementMinusArithmeticMean {

    public static void resultMatrix(int[][] matrix) {
        System.out.println("ElementMinusArithmeticMean matrix result");
        String result=new String();
        DecimalFormat df=new DecimalFormat("#,##");
        for (int[] row:matrix
             ) {
            double arithmeticMean =arithmeticMean(row);
            for (int i=0;i<row.length;i++){
               result+=String.format("%.2f",row[i]-arithmeticMean)+"; ";
            }
            result+="\n";
        }
        System.out.println(result);
    }

    private static double arithmeticMean(int[] row) {
        double am;
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        am = (double)sum / row.length;
        return am;
    }
}
