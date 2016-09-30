package com.company.Task2;


/**
 * 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */
public class FirstUniqueNumber {
    public static void uniqueOut(int[] args) {
        for (int num : args) {
            if (UniqueNum(Integer.toString(num))) {
                System.out.println("Unique number is: " + num);
                break;
            }
        }
    }

    public static boolean UniqueNum(String numToString) {
        for (int i = 0; i < numToString.length(); i++) {
            for (int j = i + 1; j < numToString.length(); j++) {
                if (numToString.charAt(i) == numToString.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
