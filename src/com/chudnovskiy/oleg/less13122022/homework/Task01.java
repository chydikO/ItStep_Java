package com.chudnovskiy.oleg.less13122022.homework;

import java.util.Arrays;

/**
 * Задание 1
 * Сформировать массив, элементами которого будут ква-
 * драты соответствующих индексов. Вывести результат на
 * экран.
 */
public class Task01 {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        double[] array = new double[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = Math.pow( (double) i, 2.0d);
        }

        System.out.println(Arrays.toString(array));
    }
}
