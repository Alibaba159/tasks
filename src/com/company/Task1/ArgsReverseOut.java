package com.company.Task1;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class ArgsReverseOut {
    public static void out(String[] args) {
        System.out.println("Args in reverse order");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.print(args[i]+"; ");
    }
}
