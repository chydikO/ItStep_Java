package com.chudnovskiy.oleg.less201222.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Завдання 2
 * Є одновимірний масив заповнений випадковими числами. Розімр задається з клавіатури.
 * Перетворити цей масив на двовимірний з кількостю елементів в рядку не більше 10
 */
public class Task02 {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final int COL = 10;
    private static int[] array;

    public static void main(String[] args) {
        arrayInit();
        arrayFill();
        arrayPrint();
        arrayTransformation();
    }

    private static void arrayTransformation() {

    }

    private static void arrayPrint() {
        System.out.println(Arrays.toString(array));
    }

    private static void arrayInit() {
        int arraySize;
        do {
            System.out.print("Input array length 1....100:\t");
            arraySize = scanner.nextInt();
        } while (arraySize <= 0 || arraySize >= 100);
        array = new int[arraySize];
    }

    private static void arrayFill() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }
}
