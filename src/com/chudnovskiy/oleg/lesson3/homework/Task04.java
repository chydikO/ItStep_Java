package com.chudnovskiy.oleg.lesson3.homework;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры количество ме-
 * тров. В зависимости от выбора пользователя программа
 * переводит метры в мили, дюймы или ярды.
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.print("Input miters :\t");
        int miters = scanner.nextInt();

        System.out.print("Press 1 for mil, 2 for in? 3 for yd:\t");
        int chose = scanner.nextInt();
        double result = 0;
        String magnitude;

        switch (chose) {
            case 1:
                result = miters * 0.00062137;
                magnitude = "\t" + result + " mil.";
                break;
            case 2:
                result = miters * 39.3701;
                magnitude = "\t" + result + " in.";
                break;
            case 3:
                result =miters * 1.0936;
                magnitude = "\t" + result + " yd.";
                break;
            default:
                magnitude = "Error input operation";
        }
        System.out.println(miters + " m = " + magnitude);
    }
}