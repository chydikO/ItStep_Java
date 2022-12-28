package com.chudnovskiy.oleg.less201222.homework;

import java.util.*;

/**
 * Завдання 1
 * У кінотеатрі n рядів по m місць у кожному (m і n повиннозадаватися з клавіатури). У двовимірному масиві розмірно-
 * ністю m на n зберігається інформація про продані квитки.
 * Число 1 означає, що квиток на дане місце вже продано, число 0 означає, що місце вільне. Надійшов запит на
 * продаж k квитків на сусідні місця в одному ряду (k повинно задаватися з клавіатури).
 * Визначте, чи можна виконати запит. Якщо решення є, вивести номери рядів та номери вільних місць
 * для продажу.
 * Число зайнятих місць і які місця зайняті на момент запроса визначте випадковим чином.
 * Вивести вихідний масив на екран.
 */
public class Task01 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static  boolean[][] cinema;
    private static int rows = 0;
    private static int cols = 0;
    private static int placesNearby;

    public static void main(String[] args) {
        inputData();
        printCinema();
        getFreeCols();
    }

    private static void getFreeCols() {
        List<Integer> arrayList;
        System.out.print("input number of available places nearby:\t");
        placesNearby = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            arrayList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                if (cinema[i][j] == false) {
                    arrayList.add(Integer.valueOf(j));
                    if (arrayList.size() == placesNearby) {
                        freeSpacePrinting(i, arrayList);
                    }
                } else {
                    arrayList = new ArrayList<>();
                }
             }
        }
    }

    private static void freeSpacePrinting(int i, List<Integer> list) {
        System.out.println("Row:\t" + i);
        System.out.println("Cols:\t" + Arrays.toString(list.toArray()));
    }

    private static void inputData() {
        System.out.print("input rows =\t");
        rows = scanner.nextInt();
        System.out.print("input cols =\t");
        cols = scanner.nextInt();

        cinema = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cinema[i][j] = random.nextBoolean();
            }
        }
    }

    private static void printCinema() {
        for (int i = 0; i < rows; i++) {
            System.out.print(i + "\t[ ");
            for (int j = 0; j < cols; j++) {
                System.out.print((cinema[i][j] == false ? 0 : 1) + " ");
            }
            System.out.print("]\n");
        }
    }
}
