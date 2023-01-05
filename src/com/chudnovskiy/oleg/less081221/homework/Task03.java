package com.chudnovskiy.oleg.less081221.homework;

public class Task03 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        drawTreangle(numberOfLines);
    }

    private static void drawTreangle(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines * 2; j++) {
                if (j == ((numberOfLines + 1) - (i - 1)) || j == ((numberOfLines + 1) + (i - 1))) {
                    System.out.print("*");
                } else if (i == numberOfLines && j > 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
