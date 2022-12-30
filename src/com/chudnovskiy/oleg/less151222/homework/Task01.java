package com.chudnovskiy.oleg.less151222.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Написати програму, в якій створюється масив на 100 елементів і ініціюється зростаючою послідовністью від 1 до 100
 * Після чого значення в масиві перемішуються і друкуються на консоль.
 */
public class Task01 {
    private static Random random = new Random();
    private static int[] array = new int[100];

    public static void main(String[] args) {
        fillArray();
        arrayPrint();
        shuffleArray();
        arrayPrint();
    }

    private static void fillArray() {
        for (int i = 0; i < array.length; ) {
            array[i] = ++i;
        }
    }

    static void shuffleArray() {
        for (int i = 0; i < array.length; i++) {
            swap(getRandomIndex(0, array.length), getRandomIndex(0, array.length));
        }
    }
    private static void swap(int index1, int index2) {
        int tmp;
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void arrayPrint() {
        System.out.println(Arrays.toString(array));
    }

    public static int getRandomIndex(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
