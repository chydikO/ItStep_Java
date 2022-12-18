package com.chudnovskiy.oleg.lesson3.homework;

/**
 * Задание 4
 * Дана точка на плоскости заданная координатами x и y,
 * определить и вывести в консоль, в какой четверти находит-
 * ся точка, в прямоугольной (декартовой) системе координат.
 * Четверти обозначены римскими цифрами.
 */
public class Task04 {
    public static void main(String[] args) {
        int x = 25;
        int y = -10;

        if ( x == 0 || y == 0 ) {
            System.out.println("0");
        } else if ( x > 0 && y > 0 ) {
            System.out.println("1");
        } else if ( x < 0 && y > 0 ) {
            System.out.println("2");
        } else if ( x < 0 && y < 0 ) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}