package com.chudnovskiy.oleg.less081221.homework;

import java.util.Scanner;

/**
 * Задание 7
 * С клавиатуры вводится целое положительное число лю-
 * бой разрядности. Необходимо перевернуть это число, т. е.
 * цифры должны располагаться в обратном порядке (напри-
 * мер, вводим число 1234 – в результате будет 4321).
 * Не использовать строки и массивы.
 */

public class Task01 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int digit, sum;
        System.out.println("Input you number:\t");
        digit = scanner.nextInt();

        System.out.print("You number is transform to:\t");
        while (digit > 0) {
            sum = digit % 10;
            digit /= 10;
            System.out.print(sum);
        }
    }
}
