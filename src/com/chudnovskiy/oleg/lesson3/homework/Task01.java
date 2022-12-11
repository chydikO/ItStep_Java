package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 1
 * Написать программу, которая предлагает пользователю
 * ввести c клавиатуры номер дня недели, и в ответ показыва-
 * ет название этого дня (например, 6 – это суббота). Решить с
 * использованием switch.
 */
public class Task01 {
    public static void main(String[] args) {
        int day;

        System.out.print("Input day of week:\t");
        day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error input!");
        }
    }
}