package com.company.Task2;

import java.util.Arrays;

/**
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 */
public class NumbersInAscendingOrder {
    public static void firstEnter(int[] ints) {
        for (int number : ints) {
            if (NumbersInAscendingOrderInNum(number) != -0) {
                System.out.println("Numbers In Ascending Order In Number " + number);
                break;
            }
        }
    }

    private static int NumbersInAscendingOrderInNum(int number) {
        String[] s = Integer.toString(number).split(" ");
        String strNum = new String();
        Arrays.sort(s);
        for (String c : s) {
            strNum += c;
        }
        if (Integer.toString(number).equals(strNum) && arithmeticalProgression(number)) {
            return number;
        } else return -0;
    }

    private static boolean arithmeticalProgression(int number) {
        String st = Integer.toString(number);
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (Character.getNumericValue(st.charAt(i)) + 1 == Character.getNumericValue(st.charAt(j)))
                    return true;
            }
        }
        return false;
    }

}
