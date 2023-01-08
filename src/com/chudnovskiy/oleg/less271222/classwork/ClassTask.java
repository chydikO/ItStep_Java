package com.chudnovskiy.oleg.less271222.classwork;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Instructions
 * Написати аплікацію в якій користувач повинен ввести електрону адресу в форматі username@domain.subdomain
 * Якщо адреса не відповідає формату, то вивести повідомлення "Електрона адреса має невірний формат" інакше запропонувати
 * ввести пароль.
 * <p>
 * Приклад невалідних адрес: @., @domain.com, username@., username.domain@, username@mail@com.ua, username@mail..com
 * Приклад валідних адрес: vasja@mail.com, masha@ua.fm, roma@i.ua
 * <p>
 * Додаткове завдання.
 * Перевірка формату рядка повинна відбуватимя в статичному методі boolean isValidEmail(String str)
 */
public class ClassTask {
    private final static Scanner scanner = new Scanner(System.in);
    private static String email;
    private static String password;

    private static final String[] noValidEmails = {
            "@.",
            "@domain.com",
            "username@.",
            "username.domain@",
            "username@mail@com.ua",
            "username@mail..com"};
    private static final String[] validEmails = {"vasja@mail.com", "masha@ua.fm", "roma@i.ua"};


    public static void main(String[] args) {
        testIsValidEmail();
        inputLogin();
        printLoginPass();
    }

    private static void printLoginPass() {
        if (password == null) {
            System.out.println("Email no valid");
        } else {
            System.out.println("You email:\t" + email);
            System.out.println("You password:\t" + password);
        }
    }

    private static void testIsValidEmail() {
        for (String email : noValidEmails) {
            assertFalse(isValidEmail(email));
        }
        System.out.println("-".repeat(10));
        for (String email : validEmails) {
            assertTrue(isValidEmail(email));
        }
    }

    public static void inputLogin() {
        System.out.print("Input you email:\t");
        email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.print("Enter password:\t");
            password = scanner.nextLine();
        }
    }

    public static boolean isValidEmail(String str) {
        if (!str.contains("@") || !str.contains(".") || str.length() == 2) {
            return false;
        }
        int indexDot = str.indexOf(".");
        int indexDog = str.indexOf('@');

        if (str.indexOf("@", indexDog + 1) > indexDog
                || str.indexOf(".", indexDot + 1) > indexDot) {
            return false;
        }

        return indexDot > indexDog + 1
                && indexDog >= 1
                && indexDot != str.length() - 1;
    }
}
