package com.chudnovskiy.oleg.less151222.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Написати програму в якій створюється масив зі значеннями 1,2,3,4,5,6. Після чого користувачу пропонується ввести будь-яке число.
 * Це число потрібно вставити в середину масиву і роздрукувати на консоль. Таким чином, якщо користувач вказав число 100, то на консоль
 * буде надрукований масив 1,2,3,100,4,5,6
 */
public class Task02 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] array = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        arrayPrint();
        insertValueInArray(enterYouNumber());
        arrayPrint();
    }

    private static int enterYouNumber() {
        System.out.print("Enter you number:\t");
        return scanner.nextInt();
    }

    private static void insertValueInArray(int value) {
        int[] tmpArray = new int[array.length + 1];
        for (int i = 0; i < array.length / 2; i++) {
            tmpArray[i] = array[i];
        }
        tmpArray[array.length / 2] = value;
        for (int i = array.length / 2; i < array.length; i++) {
            tmpArray[i + 1] = array[i];
        }
        array = tmpArray;
    }

    private static void arrayPrint() {
        System.out.println(Arrays.toString(array));
    }

}
