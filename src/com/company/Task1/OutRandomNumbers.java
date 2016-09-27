package com.company.Task1;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class OutRandomNumbers {

    public static void outWithoutAndWithNewLine(int[] numbers) {
        System.out.println("Output random numbers where each number in new line: ");
        for (int num : numbers
                ) {
            System.out.println(num);
        }

        System.out.println("Output random numbers in one line: ");
        for (int num : numbers
                ) {
            System.out.print(num + " ");
        }
    }
}
