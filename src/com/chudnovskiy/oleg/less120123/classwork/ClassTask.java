package com.chudnovskiy.oleg.less120123.classwork;

import java.util.Random;

/**
 * Порівняти кількість ітерацій, що необхідно виконати для сортування масивам на 10 000 випадкових елементів
 * Бульбашкою
 * Швидким сортуванням
 */
public class ClassTask {
    static final Random random = new Random();
    private static final int SIZE = 10_000;

    public static void main(String[] args) {
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];

        fillArray(array1);
        fillArray(array2);
        System.out.println();
    }

    private static void fillArray(int[] array) {
        int min = -100;
        int max = 100;
        for (int i = 0; i < SIZE; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            array[i] = randomNumber;
        }
    }
}
