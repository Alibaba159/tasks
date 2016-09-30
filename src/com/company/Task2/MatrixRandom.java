package com.company.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
 * тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
 * сел.
 */
public class MatrixRandom {
    public static void matrixOut() {
        System.out.println("Enter the size of matrix\nwidth");
        Scanner inputW = new Scanner(System.in);
        int width = inputW.nextInt();
        System.out.println("height");
        Scanner inputH = new Scanner(System.in);
        int height = inputH.nextInt();
        System.out.println("Enter numbers");
        int[][] matrix = new int[width][height];
        Random randNumber = new Random();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = randNumber.nextInt(100);
            }
        }

        System.out.println("Source matrix ");
        for (int[] w : matrix) {
            System.out.println(Arrays.toString(w));
        }

        MatrixSorting.sort(matrix, width, height);
    }
}
