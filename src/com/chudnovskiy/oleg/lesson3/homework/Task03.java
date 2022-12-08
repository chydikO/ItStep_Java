package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры три числа. В за-
 * висимости от выбора пользователя программа выводит
 * на экран максимум из трёх, минимум из трёх или сред-
 * неарифметическое трёх чисел.
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.print("Input number 1:\t");
        int number1 = scanner.nextInt();

        System.out.print("Input number 2:\t");
        int number2 = scanner.nextInt();

        System.out.print("Input number 3:\t");
        int number3 = scanner.nextInt();

        System.out.println("What do you want to do? Sum or multiplication .....");
        System.out.println("Input 1 - MAX, 0 - MIN, 5 - Avr.");

        int action = scanner.nextInt();
        int maxNumber = 0;
        int minNumber = 0;

        if (number1 > number2) {
            if (number1 > number3) {
                maxNumber = number1;
                minNumber = number2 < number3 ? number2 : number3;
            }
        } else {
            if (number2 > number3) {
                maxNumber = number2;
                minNumber = number1 < number3 ? number1 : number3;
            } else {
                maxNumber = number3;
                minNumber = number1 < number2 ? number1 : number2;
            }

            switch (action) {
                case 1:
                    System.out.println("MAX = " + maxNumber);
                    break;
                case 0:
                    System.out.println("MIN. = " + minNumber);
                    break;
                case 5:
                    System.out.println("Avr. = " + ((number1 + number2 * number3) / 3));
                    break;
                default:
                    System.out.println("Incorrect input");
                    return;
            }
        }
    }
}
