package com.company.Task1;

/**
 * Числа которые делятся на 3 или 9
 */
public class DivisionInto3Or9 {
    public static void resultOut(int[] numbers) {
        System.out.println("Numbers which division into 3 or 9");
        for (int num:numbers
             ) {
            if (num%3==0 || num%9==0){
                System.out.print(num+"; ");
            }
        }
        System.out.println("\n");
    }
}
