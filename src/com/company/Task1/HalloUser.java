package com.company.Task1;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class HalloUser {
    public static void hallo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}
