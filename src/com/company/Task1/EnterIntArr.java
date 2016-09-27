package com.company.Task1;

/**
 * 6.Ввести с консоли n целых чисел. На консоль вывести:
 */

import java.util.Scanner;

public class EnterIntArr {
    public static int[] returnArr() {

        System.out.println("Enter the number of digits");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < count; i++) {
            Scanner scanNumbers = new Scanner(System.in);
            numbers[i] = scanNumbers.nextInt();
            //System.out.println("next number ");
        }
        return numbers;
    }
}
