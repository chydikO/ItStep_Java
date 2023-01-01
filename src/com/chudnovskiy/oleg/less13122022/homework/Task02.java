package com.chudnovskiy.oleg.less13122022.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 2
 * Создать массив из 20 случайных чисел в диапазоне от
 * -10 до 30. Написать программу, определяющую сумму эле-
 * ментов массива, находящихся в массиве после первого от-
 * рицательного элемента (первый отрицательный элемент не
 * должен входить в сумму). Вывести на консоль полученный
 * массив и сумму.
 */
public class Task02 {
    private static final Random random = new Random();
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];

        fillArray(array, -10, 30);
        printArray(array);
        int summ = sumArraysElements(array);
        System.out.println("SUMM =\t" + summ);
    }

    private static int sumArraysElements(int[] array) {
        int result = 0;
        int index = 0;

        for (; index < ARRAY_SIZE; index++) {
            if (array[index] < 0) {
                result = summ(array, ++index);
                break;
            }
        }
        return result;
    }

    private static int summ(int[] array, int index) {
        int sum = 0;
        for (; index < ARRAY_SIZE; index++) {
            sum += array[index];
        }
        return sum;
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
