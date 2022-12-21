package com.chudnovskiy.oleg.less201222.classwork;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 2, 7, 8, 9};
        // Найпопулярніші ітеративні алгоритми сортування:
        //  - бульбашка O(n^2)
        System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < arr.length; i++) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //  - виборкою
        //  - вставками

        // Найпопулярніший рекурсивний алгоритм сорутвання:
        //  - швидке сортування

        // багатовимірні масиви
        int[][] marr = {
                {1, 2, 3},
                {3, 4, 5},
                {7, 8, 9},
        };
        for (int i = 0; i < marr.length; i++) { // loop by rows
            for (int j = 0; j < marr[i].length; j++) { // loop by columns
                System.out.print(marr[i][j] + " ");
            }
            System.out.println();
        }

        marr = new int[10][];
        for (int i = 0; i < marr.length; i++) {
            marr[i] = new int[3];
        }
        Random random = new Random();
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = random.nextInt(101);
            }
            System.out.println(Arrays.toString(marr[i]));
        }
        System.out.println(Arrays.deepToString(marr));

    }
}
