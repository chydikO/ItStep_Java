package com.chudnovskiy.oleg.less221222.homework;

/**
 * Задание 3
 * Напишите метод, который отображает горизонталь-
 * ную или вертикальную линию из некоторого символа.
 * Метод принимает в качестве параметра: длину линии,
 * направление, символ.
 */
public class Task03 {
    public static void main(String[] args) {
        drawLine(10, true, '^');
        System.out.println("-".repeat(15));
        drawLine(10, false, '^');
    }

    private static void drawLine(int length, boolean isHorizontal, char symbol) {
        if (length <= 0) {
            System.out.println("Error length");
            return;
        }
        if (isHorizontal == true) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
        System.out.println();
    }
}
