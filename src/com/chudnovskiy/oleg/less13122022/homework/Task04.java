package com.chudnovskiy.oleg.less13122022.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * адание 4
 * Создать массив из 100 случайных чисел в диапазоне от
 * - 300 до 555. Написать программу, копирующую один массив
 * в другой следующим образом: сначала копируются последо-
 * вательно все элементы, большие 0, затем последовательно
 * все элементы, равные 0, а затем последовательно все элемен-
 * ты, меньшие 0. Вывести исходный массив. Вывести резуль-
 * тирующий массив.
 */
public class Task04 {
    private static final Random random = new Random();
    private static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        int[] newArray = new int[ARRAY_SIZE];
        int index = 0;

        fillArray(array, -300, 555);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArray[index++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[index++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[index++] = array[i];
            }
        }
        printArray(newArray);
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
