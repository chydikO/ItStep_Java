package com.chudnovskiy.oleg.less201222.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Завдання 3
 * Є двовимірний масив заповнений випадковими числами. Кількість рядків задається з клавіатури.
 * Кількість елементів в першому рядку 1, в другому -2, в третьому - 3 і т.д.
 * Перетворити цей масив на одновимірний, що складається з даних двовимірного масиву.
 */
public class Task03 {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static int[][] array;
    private static int arrayRows;


    public static void main(String[] args) {
        arrayInit();
        arrayFill();
        arrayPrint(array);
        arrayPrint(arrayTransformation());

    }

    private static int[] arrayTransformation() {
        int newArraySize = getNewArraySize();
        int[] newArray = new int[newArraySize];
        int startIndex = 0;
        int stopIndex;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
            newArray[i] = (i + 1 < rows) ? new int[COL] : new int[array.length % COL];
            stopIndex = newArray[i].length;
            newArray[i] = Arrays.copyOfRange(array, startIndex, startIndex + stopIndex);
            startIndex = newArray[i].length;
        }
        return newArray;
    }

    private static int getNewArraySize() {
        int arraySize = 0;

        return arraySize;
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
        do {
            System.out.print("Input array rows 1....100:\t");
            arrayRows = scanner.nextInt();
        } while (arrayRows <= 0 || arrayRows >= 100);
        array = new int[arrayRows][];
    }

    private static void arrayFill() {
        int column = 0;
        for (int i = 0; i < arrayRows; i++) {
            array[i] = new int[column + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
            column++;
        }
    }
}
