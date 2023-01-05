package com.chudnovskiy.oleg.less061222.homework;

/**
 * Задание 1
 * Числа Фибоначчи – это последовательность чисел, в ко- торой два первых числа последовательности равны 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих.Показать на экране все числа Фибоначчи в диапазоне от
 * 0 до 10 000 000.
 */
public class Task01 {
    public static void main(String[] args) {
        double x = 0, y = 1;
        double z = 0;
        do {
            System.out.println(z);
            z = x + y;
            x = y;
            y = z;
        } while (z <= 10_000_000d);
    }
}
