package com.chudnovskiy.oleg.lesson02.homework;

import java.util.Scanner;

/**
 * Задание 5
 * Подсчитать площадь и длину окружности для круга с ра-
 * диусом R. Радиус должен быть задан константой в програм-
 * ме. Вывести результат на консоль.
 */
public class Task05 {
    private static final double RADIUS = 10.24d;
    
    public static void main(String args[]) {

        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Area of a circle: " + area);

        double circumference = Math.PI * 2 * RADIUS;
        System.out.println("Circumferences: " + circumference);
    }
}
