package com.chudnovskiy.oleg.less081221.homework;

import static java.lang.Math.abs;

/**
 *  Задание 4
 * Ромб: заполненный и пустой.
 */
public class Task04 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        System.out.println(draw(numberOfLines));
    }

    private static String draw(int numberOfLines) {
        int i, j;
        String str = "";
        for (i = 1; i <= numberOfLines; i++) {
            for (j = numberOfLines; j > i; j--) {
                str += " ";
            }
            str += "*";
            for (j = 1; j < (i - 1) * 2; j++) {
                str += " ";
            }
            if (i == 1) {
                str += "\n";
            } else {
                str += "*\n";
            }
        }
        for (i = 2; i <= numberOfLines; i++) {
            for (j = 1; j < i; j++) {
                str += " ";
            }

            for (j = 1; j <= numberOfLines * 2 - (2 * i - 1); j++) {

                if (i == 0 || j == 1 || j == numberOfLines * 2 - (2 * i - 1)) {
                    str += "*";
                } else {
                    str += " ";
                }

            }
            str += "\n";
        }
        return str;
    }
}
