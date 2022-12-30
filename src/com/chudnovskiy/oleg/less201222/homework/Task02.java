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
        arrayPrint(array);
        arrayPrint(arrayTransformation());

    }

    private static int[][] arrayTransformation() {
        int rows = getArrayRows();
        int[][] newArray = new int[rows][];
        int startIndex = 0;
        int stopIndex;

        for (int i = 0; i < rows; i++) {
            newArray[i] = (i + 1 < rows) ? new int[COL] : new int[array.length % COL];
            stopIndex = newArray[i].length;
            newArray[i] = Arrays.copyOfRange(array, startIndex, startIndex + stopIndex);
            startIndex = newArray[i].length;
        }
        return newArray;
    }

    private static int getArrayRows() {
        int rows = array.length / COL;
        double realRows = (double) array.length / (double) COL;
        if (realRows % 2 != 0) {
            rows++;
        }
        return rows;
    }

    private static void arrayPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void arrayPrint( int[][] array) {
        for (int i = 0; i < array.length; i++) {
            arrayPrint(array[i]);
        }
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
