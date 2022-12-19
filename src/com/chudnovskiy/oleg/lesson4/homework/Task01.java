package com.chudnovskiy.oleg.lesson4.homework;

/**
 * Числа Фибоначчи – это последовательность чисел, в ко-
 * торой два первых числа последовательности равны 0 и 1, а
 * каждое последующее число равно сумме двух предыдущих.
 * Показать на экране все числа Фибоначчи в диапазоне от
 * 0 до 10 000 000.
 */
public class Task01 {
    public static void main(String[] args) {
        double n = 0;
        double n1 = 1;
        double count = 10_0;
        while (count != 0) {
            n += n1;
            n1 = n - n1;
            count--;
            System.out.println(n);
        }
    }
}
