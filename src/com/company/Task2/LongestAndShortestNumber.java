package com.company.Task2;

/**
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */
public class LongestAndShortestNumber {
    public static void resultOut(int[] ints) {
        int longest = ints[0], shortest = ints[0];
        for (int number : ints
                ) {
            if (longest < number ) {
                longest = number;
            }
            if (shortest > number){
                shortest = number;
            }
        }
        System.out.println("Longest number is: " + longest + " length = " + Integer.toString(longest).length() + "\n" +
                "Shortest number is: " + shortest + " length = " + Integer.toString(shortest).length());
    }
}
