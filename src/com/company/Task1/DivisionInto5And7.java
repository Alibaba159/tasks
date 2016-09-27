package com.company.Task1;

/**
 * Числа которые делятся на 5 и 7
 */
public class DivisionInto5And7 {
    public static void resultOut(int[] numbers) {
        System.out.println("Numbers which division into 5 and 7");
        for (int num:numbers
                ) {
            if (num%5==0 & num%7==0){
                System.out.print(num+"; ");
            }
        }
        System.out.println("\n");
    }
}
