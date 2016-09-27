package com.company.Task1;

/**
 * Created by QA on 23.09.2016.
 */
public class MaxNumber {
    public static void maxNumberOut(int[] numbers) {
        int maxNumb = numbers[0];
        for (int num : numbers
                ) {
            if (maxNumb < num) {
                maxNumb = num;
            }
        }
        System.out.println("\nMax number is: "+maxNumb);
    }
}
