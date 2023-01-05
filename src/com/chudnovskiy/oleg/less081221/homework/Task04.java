package com.chudnovskiy.oleg.less081221.homework;

/**
 * Задание 4
 * Ромб: заполненный и пустой.
 */
public class Task04 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        System.out.println(draw(numberOfLines));
    }

    private static String draw(int numberOfLines) {
        int i, j;
        StringBuilder str = new StringBuilder();
        for (i = 1; i <= numberOfLines; i++) {
            for (j = numberOfLines; j > i; j--) {
                str.append(" ");
            }
            str.append("*");
            for (j = 1; j < (i - 1) * 2; j++) {
                str.append(" ");
            }
            if (i == 1) {
                str.append("\n");
            } else {
                str.append("*\n");
            }
        }
        for (i = 2; i <= numberOfLines; i++) {
            for (j = 1; j < i; j++) {
                str.append(" ");
            }

            for (j = 1; j <= numberOfLines * 2 - (2 * i - 1); j++) {
                if (i == 0 || j == 1 || j == numberOfLines * 2 - (2 * i - 1)) {
                    str.append("*");
                } else {
                    str.append(" ");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }
}
