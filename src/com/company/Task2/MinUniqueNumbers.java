package com.company.Task2;

/**
 * 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */
public class MinUniqueNumbers {
    public static void numbersOut(int[] ints) {
        for (int number : ints) {
            if (countUnUniqueNumbersInNumber(Integer.toString(number)) <= countUniqueNumbersInNumber(Integer.toString(number))) {
                System.out.println("Number where count isn`t  unique numbers <= count unique numbers "+number);
                break;
            }
        }
    }

    public static int countUnUniqueNumbersInNumber(String numToString) {
        int countUnUnique = 0;
        for (int i = 0; i < numToString.length(); i++) {
            for (int j = i + 1; j < numToString.length(); j++) {
                if (numToString.charAt(i) != numToString.charAt(j)) {
                    ++countUnUnique;
                }
            }
        }
        return countUnUnique;
    }

    public static int countUniqueNumbersInNumber(String numToString) {
        int countUnique = 0;
        for (int i = 0; i < numToString.length(); i++) {
            for (int j = i + 1; j < numToString.length(); j++) {
                if (numToString.charAt(i) == numToString.charAt(j)) {
                    ++countUnique;
                }
            }
        }
        return countUnique;
    }
}
