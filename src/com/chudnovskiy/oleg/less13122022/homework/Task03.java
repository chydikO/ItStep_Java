package com.chudnovskiy.oleg.less13122022.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 3
 * Создать массив из 200 случайных чисел в диапазоне от 0
 * до 200. Определить количество одноразрядных, двухразряд-
 * ных и трёхразрядных чисел в процентном отношении. Вы-
 * вести на консоль полученный массив и количество по раз-
 * рядам.
 * Пример:
 * digit 1 = 4
 * digit 2 = 45
 * digit 3 = 39
 */
public class Task03 {
    private static final Random random = new Random();
    private static final int ARRAY_SIZE = 200;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];

        fillArray(array, 0, 200);
        printArray(array);

        interestCalculation(bitDepthCalculation(array));
    }

    private static void interestCalculation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            float percentDigit = ((float) array[i] / (float) ARRAY_SIZE) * 100.0f;
            System.out.println("Digit " + (i + 1) + ":\t" + String.format("%.02f", percentDigit) + "%");
        }
    }

    private static int[] bitDepthCalculation(int[] array) {
        int digit1Count = 0;
        int digit2Count = 0;
        int digit3Count = 0;

        for (int number : array) {
            int tmp = countDigits(number);
            if (tmp == 1) {
                digit1Count++;
            } else if (tmp == 2) {
                digit2Count++;
            } else if (tmp == 3) {
                digit3Count++;
            }
        }
        return new int[]{digit1Count, digit2Count, digit3Count};
    }

    private static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
    }
}
