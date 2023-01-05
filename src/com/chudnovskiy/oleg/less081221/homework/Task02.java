package com.chudnovskiy.oleg.less081221.homework;

import java.util.Scanner;

/**
 * Задание 8
 * С клавиатуры вводится целое число любой разрядности. Программа должна определить и вывести на консоль коли-
 * чество цифр в этом числе, а так же сумму этих чисел.
 */
public class Task02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int digit;
        System.out.print("Input you number:\t");
        digit = scanner.nextInt();

        int numberOfDigit = 0;
        int sumDigit = 0;
        do {
            sumDigit += digit % 10;
            ++numberOfDigit;
        } while ( (digit /= 10) != 0 );

        System.out.println("Number of Digit`s:\t" + numberOfDigit);
        System.out.println("Summa of Digit`s:\t" + sumDigit);
    }
}
