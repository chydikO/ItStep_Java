package com.chudnovskiy.oleg.less221222.homework;

import java.util.Arrays;

/**
 * адание 2
 * Напишите метод, который принимает два числа в каче-
 * стве параметра и отображает все четные числа между ними.
 */
public class Task02 {
    private static int[] numbers;
    public static void main(String[] args) {
        evenNumbers(9, 16);
    }

    private static void evenNumbers(int number1, int number2) {
        if (number2 < number1) {
            System.out.println("Error number range ....");
            return;
        } else if (number2 == number1) {
            printNumber(number1);
            return;
        } else if (number2 - number1 == 1) {
            System.out.println("no numbers in given range");
            return;
        }
        numbers = new int[number2 - number1];
        int j = 0;
        for (int i = ++number1; i < number2; i++) {
            if (i % 2 == 0) {
                numbers[j] = i;
                j++;
            }
        }
        numbers = Arrays.copyOf(numbers, j);
        if (numbers.length == 1) {
            printNumber(numbers[0]);
        } else {
            System.out.println(Arrays.toString(numbers));
        }
    }

    private static void printNumber(int number) {
        System.out.println(number % 2 == 0 ? number : "odd number");
    }
}
