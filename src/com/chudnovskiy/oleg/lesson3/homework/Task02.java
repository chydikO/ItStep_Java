package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры три числа. В за-
 * висимости от выбора пользователя программа выводит
 * на экран сумму трёх чисел или произведение трёх чисел.
 */
public class Task02 {
    public static void main(String[] args) {
        /*
        была проблемма со сканером, в буфере был знак перевод строки и поэтому не считывалось значение String.
        Зделал немного навыворот по логике работы
         */
        System.out.println("What do you want to do? Sum or multiplication .....");
        System.out.println("Input S - sum or M - multiplication");

        String action = scanner.nextLine().toLowerCase();
        System.out.print("Input number 1:\t");
        int number1 = scanner.nextInt();

        System.out.print("Input number 2:\t");
        int number2 = scanner.nextInt();

        System.out.print("Input number 3:\t");
        int number3 = scanner.nextInt();

        switch (action) {
            case "s":
                System.out.println("Sum = " + (number1 + number2 + number3));
                break;
            case "v":
                System.out.println("Mult. = " + (number1 * number2 * number3));
                break;
            default:
                return;
        }
    }
}
