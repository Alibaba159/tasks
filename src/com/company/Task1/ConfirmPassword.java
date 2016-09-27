package com.company.Task1;

/**
 * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */

import java.util.Scanner;

public class ConfirmPassword {
    public static void confirmResult() {
        System.out.println("Please, enter your password: ");
        Scanner pas = new Scanner(System.in);
        String password = pas.nextLine();
        System.out.println("Please, confirm password: ");
        Scanner cpas = new Scanner(System.in);
        String confirmPassword = cpas.nextLine();
        if (password.equals(confirmPassword)) {
            System.out.println("Your password correct");
        } else {
            System.out.println("Wrong confirm password");
        }
    }
}
