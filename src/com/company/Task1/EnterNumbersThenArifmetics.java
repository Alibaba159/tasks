package com.company.Task1;

/**
 * 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
 */

public class EnterNumbersThenArifmetics {

    public static void returnArr(String[] args) {
        int sum = 0, multipl = 1;
        for (String a : args
                ) {
            int number = Integer.parseInt(a);
            sum += number;
            multipl *= number;
        }
        System.out.println("Summation is: " + sum);
        System.out.println("Multiplication is: " + multipl);
    }
}
