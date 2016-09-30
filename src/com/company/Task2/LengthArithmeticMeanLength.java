package com.company.Task2;

/**
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
 */
public class LengthArithmeticMeanLength {
    public static double arithmeticMeanLength(int[] ints) {
        int length = 0;
        for (int num : ints) {
            length += Integer.toString(num).length();
        }
        return length / ints.length;
    }

    public static void lessLength(int[] ints) {
        System.out.println("Numbers which length is smaller average");
        double amLength = arithmeticMeanLength(ints);
        for (int num : ints) {
            if (Integer.toString(num).length() < amLength) {
                System.out.println(num + "; length = " + Integer.toString(num).length());
            }
        }
    }

    public static void moreLength(int[] ints) {
        System.out.println("Numbers which length is larger average");
        double amLength = arithmeticMeanLength(ints);
        for (int num : ints) {
            if (Integer.toString(num).length() > amLength) {
                System.out.println(num + "; length = " + Integer.toString(num).length());
            }
        }
    }
}
