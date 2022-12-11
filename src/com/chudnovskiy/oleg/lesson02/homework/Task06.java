package com.chudnovskiy.oleg.lesson02.homework;

/**
 *  Задание 6
 * Есть прямоугольник, у которого известна ширина w и
 * высота h. Найти и вывести на консоль периметр и площадь
 * заданного прямоугольника. Высота и ширина прямоуголь-
 * ника должна задаваться константными переменными в коде
 * программы.
 */
public class Task06 {
    private static final double WIDTH = 12.1d;
    private static final double HEIGHT = 22.1d;

    public static void main(String[] args) {
        double  area = WIDTH * HEIGHT;
        double perimeter = (WIDTH + HEIGHT) * 2;

        System.out.println("area:\t" + area);
        System.out.println("perimeter:\t" + perimeter);
    }
}
