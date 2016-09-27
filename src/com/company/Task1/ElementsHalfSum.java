package com.company.Task1;

/**
 * 6.7. Элементы, которые равны полусумме соседних элементов.
 */
public class ElementsHalfSum {
    public static void findElement(int[] numbers6) {
        System.out.println("6.7. Элементы, которые равны полусумме соседних элементов.");
        for (int i = 1; i < numbers6.length - 1; i++) {
            if (numbers6[i] == (numbers6[i - 1] + numbers6[i + 1]) / 2) {
                System.out.print(numbers6[i] + "; ");
            }
        }
    }
}
