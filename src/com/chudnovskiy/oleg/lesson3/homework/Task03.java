package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 3
 * Написать программу, которая предлагает пользователю
 * выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
 * ответ показывает, какие звуки издает выбранное животное.
 * В списке должно быть не менее 10 животных.
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println("1 - Собака");
        System.out.println("2 - Кот");
        System.out.println("3 - Петух");
        System.out.println("4 - Рыба");
        System.out.println("5 - Корова");
        System.out.println("6 - Свинья");
        System.out.println("7 - ворона");
        System.out.println("8 - Утка");
        System.out.println("9 - Курица");
        System.out.println("10 - Коза");

        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Гав");
                break;
            case 2:
                System.out.println("Мав");
                break;
            case 3:
                System.out.println("КуКаРеКУ!");
                break;
            case 4:
                System.out.println("---");
                break;
            case 5:
                System.out.println("Му");
                break;
            case 6:
                System.out.println("Хрю");
                break;
            case 7:
                System.out.println("Кар");
                break;
            case 8:
                System.out.println("Кря");
                break;
            case 9:
                System.out.println("КоКоКо");
                break;
            case 10:
                System.out.println("Ме");
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
