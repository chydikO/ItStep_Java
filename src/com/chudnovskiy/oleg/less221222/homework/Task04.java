package com.chudnovskiy.oleg.less221222.homework;

/**
 * Задание 4
 * Напишите метод, который возвращает максимальное
 * из четырёх чисел. Числа передаются в качестве параметров.
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.println(maxNumber(20, 40, 10, -234));
    }

    private static int maxNumber(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}
