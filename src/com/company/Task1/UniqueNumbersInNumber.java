package com.company.Task1;

import com.company.Task2.FirstUniqueNumber;

/**
 * 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 */
public class UniqueNumbersInNumber {
    public static void findNumbers(int[] numbers6) {
        System.out.println("Task1_6.5\nUnique number(s) is: ");
        for (int num : numbers6) {
            if (FirstUniqueNumber.UniqueNum(Integer.toString(num))) {
                System.out.print(num + "; ");
            }
        }
    }
}
