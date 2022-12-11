package com.chudnovskiy.oleg.lesson4.classwork;

import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * За допомогою двох вкладених циклів for надрукувати в консоль "шахову дошку"
 * Чорна клітинка буде символ *, а біла - пробіл
 */
public class ChessBoard {
    public static void main(String[] args) {
        System.out.print("Input width :\t");
        int width = scanner.nextInt();

        System.out.print("Input height:\t");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
