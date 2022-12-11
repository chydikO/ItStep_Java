package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 2
 * С клавиатуры вводится время (количество часов от 0 до
 * 24) – программа выводит приветствие, соответствующее
 * введенному времени (например, ввели 15 часов – выводится
 * приветствие «Добрый день»).
 */
public class Task02 {
    public static void main(String[] args) {
        int hours;

        System.out.print("Enter hours\t");
        hours = scanner.nextInt();

        if (hours >= 5 && hours <= 11) {
            System.out.println("Good Morning");
        } else if (hours >= 12 && hours <= 16) {
            System.out.println("Good Afternoon");
        } else if (hours >= 17 && hours <= 20) {
            System.out.println("Good Evening");
        } else if (hours >= 21 && hours <= 4) {
            System.out.println("Good Night");
        }
    }
}
