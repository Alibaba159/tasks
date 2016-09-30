package com.company.Task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
 */
public class Matrix {
    public static void scanAndOut() {
        System.out.println("Enter the size of matrix\nwidth");
        Scanner inputW = new Scanner(System.in);
        int width = inputW.nextInt();
        System.out.println("hight");
        Scanner inputH = new Scanner(System.in);
        int height = inputH.nextInt();
        System.out.println("Enter numbers");
        int[][] matrix = new int[width][height];

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++) {
                Scanner inputNumber = new Scanner(System.in);
                matrix[i][j] = inputNumber.nextInt();
            }
        }

        for (int[] w : matrix) {
            System.out.println(Arrays.toString(w));
        }
    }
}
