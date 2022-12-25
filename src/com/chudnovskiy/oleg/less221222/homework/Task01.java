package com.chudnovskiy.oleg.less221222.homework;

/**
 * Задание 1
 * Напишите метод, который отображает на экран фор-
 * матированный текст, указанный ниже
 * “Someone’s sitting in the shade today
 * because someone planted a tree a long time ago.”
 * Warren Buffet.
 */
public class Task01 {
    public static void main(String[] args) {
        printQuote();
    }

    public static void printQuote() {
        System.out.println("\"Someone’s sitting in the shade today\n" +
                " because someone planted a tree a long time ago.\"\n" +
                " Warren Buffet.");
    }
}
