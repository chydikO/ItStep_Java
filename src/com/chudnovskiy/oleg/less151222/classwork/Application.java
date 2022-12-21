package com.chudnovskiy.oleg.less151222.classwork;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // array algorithms
        // - reduce: sum, avg, production
        // - search min/max value (index)
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // [0..99] or [0..100)
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //   * linear search O(n)
        int search = 10;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                idx = i;
                break;
            }
        }
        if (idx >= 0) {
            System.out.println("Found: " + idx);
            System.out.println(arr[idx]); // O(1)
        } else {
            System.err.println("Not found");
        }
        //   * binary search O(log2(n))
        //   n      | linear     | binary
        // ------------------------------
        // 100      | O(100)     | O(7)
        // 1000     | O(1000)    | O(10)
        // 10000    | O(10000)   | O(14)
        // 1000000  | O(100000)  | O(20)
        arr = new int[]{2, 5, 7, 9, 10, 23, 67, 89, 100};
        search = 89;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        do {
            mid = (right + left) / 2;
            if (arr[mid] < search) {
                left = mid;
            } else if (arr[mid] > search) {
                right = mid;
            }
        } while (arr[mid] != search);
        System.out.println("Found: " + mid);

        // - sorting
    }
}
