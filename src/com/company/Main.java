package com.company;

import com.company.Task1.*;
import com.company.Task2.FirstUniqueNumber;
import com.company.Task2.Matrix;
import com.company.Task2.MatrixRandom;
import com.company.Task2.SortNumbersByLength;

/**
 * Ввести n чисел с консоли.
 *
 *
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
 * 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
 * 5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 *


 * 9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
 * (влево, вверх, вниз).
 * 9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 * 9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
 *
 * 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
 * 9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
 *
 */
public class Main {


    public static void main(String[] args) {
        //LongestAndShortestNumber.resultOut(EnterIntArr.returnArr());
        /*-*///SortNumbersByLength.sortingResultOut(EnterIntArr.returnArr());
        //FirstUniqueNumber.resultOut(EnterIntArr.returnArr());
        //Matrix.scanAndOut();
        MatrixRandom.matrixOut();

    }
}
