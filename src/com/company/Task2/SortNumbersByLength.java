package com.company.Task2;

import java.util.Arrays;

/**
 * 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
 */
public class SortNumbersByLength {
    public static void sortingResultOut(int[] ints) {
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
       /* for (int i = ints.length; i >= 0; i--) {
            System.out.println(ints[i]);
        }*/

    }
}
