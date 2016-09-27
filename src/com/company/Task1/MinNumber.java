package com.company.Task1;

/**
 * Created by QA on 23.09.2016.
 */
public class MinNumber {
    public static void minNumberOut(int[] numbers) {
        int minNumb = numbers[0];
        for (int num : numbers
                ) {
            if (minNumb > num) {
                minNumb = num;
            }
        }
        System.out.println("\nMin number is: "+minNumb);
    }
}
