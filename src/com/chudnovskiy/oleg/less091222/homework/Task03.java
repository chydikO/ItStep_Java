package com.chudnovskiy.oleg.less091222.homework;

import java.util.Scanner;

/**
 * 3. Написать программу, которая выводит на экран таблицу со-
 * ответствия температуры в градусах Цельсия и Фаренгейта
 * (F°= 5/9·C° + 32). Диапазон изменения температуры в градусах
 * Цельсия и шаг должны вводиться во время работы программы.
 * Рекомендуемый вид экрана приведен ниже.
 * <p>
 * t1 –> 0
 * t2 –> 10
 * dt–> 1
 * -----------------
 * C F
 * -----------------
 * 0.00 32.00
 * 1.00 33.80
 * 2.00 35.60
 * 3.00 37.40
 * 4.00 39.20
 * 5.00 41.00
 * 6.00 42.80
 * 7.00 44.60
 * 8.00 46.40
 * 9.00 48.20
 * 10.00 50.00
 * -----------------
 */
public class Task03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t1, t2, dt;
        double tF;
        System.out.print("t1->\t");
        t1 = scanner.nextInt();

        System.out.print("t2->\t");
        t2 = scanner.nextInt();

        System.out.print("dt->\t");
        dt = scanner.nextInt();

        System.out.println("-".repeat(20));
        System.out.println("C\u00B0\t->\tF\u00B0\t ");
        System.out.println("-".repeat(20));

        for (int i = t1; i <= t2; ) {
            tF = (1.8 * (double) i + 32);
            System.out.printf((float) i + "\t" + "%.2f\n", tF);
            i += dt;
        }
        System.out.println("-".repeat(20));
    }
}
