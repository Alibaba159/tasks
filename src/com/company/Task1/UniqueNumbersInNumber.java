package com.company.Task1;

/**
 * 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 */
public class UniqueNumbersInNumber {
    public static void findNumbers(int[] numbers6) {
        String list = new String();
        for (int num : numbers6
                ) {
            String n = Integer.toString(num);
            if (n.length() == 3 && n.charAt(0) != n.charAt(1)
                    && n.charAt(1) != n.charAt(2)
                    && n.charAt(0) != n.charAt(2)) {
                list += num + "; ";
            }

        }
        System.out.println("Result task1 #6.5: " + list);
    }
}

