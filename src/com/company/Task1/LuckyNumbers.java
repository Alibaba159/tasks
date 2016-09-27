package com.company.Task1;

/**
 * «Счастливые» числа.
 */
public class LuckyNumbers {
    public static void numbersOut(int[] numbers6) {
        System.out.println("6.6. «Счастливые» числа.");
        String num, numbers = new String();
        int i, j;
        for (i = 0; i < numbers6.length; i++) {
            num = Integer.toString(numbers6[i]);
            if (num.length() >= 4 && (num.length() % 2) == 0) {
                int sum1 = 0, sum2 = 0;
                for (j = 0; j < num.length() / 2; j++) {
                    sum1 += num.charAt(j);
                    sum2 += num.charAt(j + (num.length() / 2));
                }
                if (sum1 == sum2) {
                    numbers += num + "; ";
                }
            }
        }
        System.out.println("Lucky number(s) is: " + numbers);
    }
}
