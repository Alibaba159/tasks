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
                matrix[i][j] = randNumber.nextInt(2);
            }
        }

        System.out.println("Source matrix ");
        for (int[] w : matrix) {
            System.out.println(Arrays.toString(w));
        }

       /* *//**
         * sorting source matrix
         *//*
        MatrixSorting.sort(matrix, width, height);

        *//**
         * turned source matrix
         *//*
        System.out.println("Rotated source matrix 90");
        int[][] turnedMatrix90 = TurnMatrix.turn90(matrix, width, height);
        System.out.println("Rotated source matrix 180");
        int[][] turnedMatrix180 = TurnMatrix.turn90(turnedMatrix90, width, height);
        System.out.println("Rotated source matrix 270");
        int[][] turnedMatrix270 = TurnMatrix.turn90(turnedMatrix180, width, height);
*/
        /**
         * 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
         */
        ElementMinusArithmeticMean.resultMatrix(matrix);
        /**
         *9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
         */
        //ZeroToEnd.resultOut(matrix, height);
    }
}
