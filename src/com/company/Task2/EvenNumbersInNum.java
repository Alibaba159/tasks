package com.company.Task2;

/**
 * 5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
 */
public class EvenNumbersInNum {
    public static void CountEvenNumbers(int[] ints) {
        int count = 0;
        for (int number : ints
                ) {
            if (onlyEvenNumbers(number)) {
                ++count;
            }
        }
        System.out.println("Count even numbers = " + count);

        count = 0;
        for (int number : ints
                ) {
            if (evenEquallyOddNumbers(number)) {
                ++count;
            }
        }
        System.out.println("Count even numbers equally count even numbers = " + count);
    }

    private static boolean evenEquallyOddNumbers(int number) {
        String st = Integer.toString(number);
        int counteven = 0, countOdd = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.getNumericValue(st.charAt(i)) % 2 == 0) {
                ++counteven;
            }
            if (Character.getNumericValue(st.charAt(i)) % 2 != 0) {
                ++countOdd;
            }
        }
        if (counteven == countOdd) {
            return true;
        } else return false;
    }

    private static boolean onlyEvenNumbers(int number) {
        String st = Integer.toString(number);
        for (int i = 0; i < st.length(); i++) {
            if (Character.getNumericValue(st.charAt(i)) % 2 == 0)
                return true;
        }
        return false;
    }
}
