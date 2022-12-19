package com.chudnovskiy.oleg.lesson05.homework;

/**
 * Прямоугольный треугольник,
 * прямым углом вниз-вправо:
 * заполненный и пустой.
 */
public class Task01 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}