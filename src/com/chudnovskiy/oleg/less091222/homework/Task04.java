package com.chudnovskiy.oleg.less091222.homework;

import java.util.Scanner;

/**
 * 4. Написать программу, которая определяет минимальное чис-
 * ло во введенной с клавиатуры последовательности положитель-
 * ных чисел (длина последовательности не ограничена). Ниже при-
 * веден рекомендуемый вид экрана программы
 * <p>
 * <p>
 * Определение минимального числа в последовательности положитель-
 * ных чисел.
 * Вводите после стрелки числа. Для завершения ввода введите ноль.
 * >12
 * >75
 * >10
 * >9
 * >23
 * >0
 * Минимальное число: 9
 */
public class Task04 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int number;
    private static int minNumber = 0;

    public static void main(String[] args) {
        System.out.println("Определение минимального числа в последовательности положительных чисел.");
        System.out.print("Вводите после стрелки числа. Для завершения ввода введите ноль\n\t>\t");
        number = minNumber = scanner.nextInt();

        do {
            System.out.print("\t>\t");
            number = scanner.nextInt();
            if (number < minNumber && number != 0 && number > 0) {
                minNumber = number;
            }
        } while (number != 0);

        System.out.println("Минимальное число:\t" + minNumber);
    }
}
