package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 *Задание 1
 * Пользователь вводит с клавиатуры число. Необходи-
 * мо проверить его на четность и нечетность. Если число
 * четное требуется вывести на экран число и надпись «Even
 * number». Если число нечетное выведите на экран число
 * и надпись «Odd number
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.print("Input number:\t");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
