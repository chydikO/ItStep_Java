package com.chudnovskiy.oleg.less271222.homework;

import org.junit.Assert;

import java.util.Arrays;

/**
 * 2. Написати статичний метод sortDays(), що приймає в якості аргументу масив рядків, що містять дні тижня і повертає
 * відсортований масив впорядкований по дням тижня (Пн, Вт, Ср і т.д.)
 * Для сорування використовувти алгритм виборкою
 * <p>
 * Наприклад, масив ["Нд", "Ср", "Пн", "Сб", "Чт", "Пт", "Вт"]
 * повинен бути впорядкований: ["Пн", "Вт","Ср","Чт","Пт","Сб","Нд"]
 */


public class Task02 {
    private static final String[] WEEK_OF_THE_DAYS = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};

    public static void main(String[] args) {

        String[] array = {"Неділя", "Середа", "Понеділок", "Субота", "Четвер", "П'ятниця", "Вівторок"};
        sortDays(array);
        Assert.assertArrayEquals(WEEK_OF_THE_DAYS, array);
    }

    private static void sortDays(String[] array) {
        int minIndex;

        for (int index = 0; index < array.length - 1; index++) {
            minIndex = index;
            for (int scan = index + 1; scan < array.length; scan++) {
                if (getIndexOfTheWeek(array[scan]) < getIndexOfTheWeek(array[minIndex]))
                    minIndex = scan;
            }
            swap(array, minIndex, index);
        }
    }

    private static void swap(String[] array, int minIndex, int index) {
        String string;
        string = array[minIndex];
        array[minIndex] = array[index];
        array[index] = string;
    }

    private static int getIndexOfTheWeek(String dayOfTheWeek) {
        return Arrays.asList(WEEK_OF_THE_DAYS).indexOf(dayOfTheWeek);
    }
}
