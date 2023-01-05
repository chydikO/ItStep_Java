package com.chudnovskiy.oleg.less061222.homework;

import static java.lang.Math.pow;

/**
 *    Задание 3
 * Самовлюблённое число или число Армстронга – натураль- ное число, которое равно сумме своих цифр, возведенных в степень,
 * равную количеству его цифр. Показать на экране все числа Армстронга в диапазоне от 10 до 1 000 000.
 * Например:
 * 153 = 13 + 53 + 33
 */
public class Task03 {
    public static void main(String[] args) {
        for (int i = 10; i < 1_000_000; i++) {
            if (armstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean armstrongNumber(int i) {
        int a, b;
        int countOfNumber;
        int summa = 0;

        a = b = i;
        countOfNumber = String.valueOf(a).length();

        while (b != 0) {
            summa += (int)pow(b % 10, countOfNumber);
            b /= 10;
        }
        return summa == i;
    }
}
