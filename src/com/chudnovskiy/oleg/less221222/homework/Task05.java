package com.chudnovskiy.oleg.less221222.homework;

/**
 * Задание 5
 * Напишите метод, который возвращает сумму чисел
 * в указанном диапазоне. Границы диапазона передаются
 * в качестве параметров.
 */
public class Task05 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(3, 2));
    }

    private static int sumOfNumbers(int startNumber, int length) {
        int sum = 0;
        if (length <= 0) {
            System.out.print("Error number range .... SUM = ");
            return sum;
        }
        for (int i = startNumber; i <= startNumber + length; i++) {
            sum += i;
        }
        return sum;
    }
}
