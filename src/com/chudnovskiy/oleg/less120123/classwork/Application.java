package com.chudnovskiy.oleg.less120123.classwork;

import java.util.Arrays;

public class Application {

    static int count;

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        System.out.println("Before: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));
        if (low >= high) {
            return;
        }
        int middle = (high + low) / 2;
        int pivot = arr[middle];
        System.out.println("Pivot: " + pivot);
        int i = low;
        int j = high;
        while (i <= j) {
            count++;
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        System.out.println("After: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));
        if (low < j) {
            System.out.println("Sort left part from " + low + " to " + j);
            quickSort(arr, low, j);
        }
        if (high > i) {
            System.out.println("Sort right part from " + i + " to " + high);
            quickSort(arr, i, high);
        }
    }

    public static void main(String[] args) {
        //           5, 4, 8, 9, 1, 2, 3, 6, 7
        int[] arr = {5, 4, 8, 9, 1, 2, 3, 6, 7};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        quickSort(arr);
        System.out.println(count);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
