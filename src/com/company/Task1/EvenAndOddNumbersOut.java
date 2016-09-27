package com.company.Task1;

/**
 * 6.1. Четные и нечетные числа.
 */
public class EvenAndOddNumbersOut {
    public static void evenOut(int[] numbers) {
        System.out.println("Even Numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + "; ");
            }
        }
    }

    public static void addOut(int[] numbers) {
        System.out.println("\nOdd Numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + "; ");
            }
        }
    }
}
