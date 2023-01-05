package com.chudnovskiy.oleg.less081221.classwork;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // while, do..while
        int n = 0;
        while (n < 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        // for
        for (int i = 1; i < 10; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // break
        while (true) {
            System.out.println("Is it infinity loop?");
            break;
        }
        n = 0;
        while (true) {
            System.out.print(n + " ");
            n++;
            if (n > 9) {
                break;
            }
        }
        System.out.println();
        // continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // nested loops
        for (int i = 0; i < 10; i++) { // loop by rows
            for (int j = 0; j < 10; j++) { // loop by columns
                System.out.printf("%4d", (i + 1) * (j + 1));
            }
            System.out.println();
        }

        int number;
        Scanner scanner = new Scanner(System.in);
        // labels
        menu:
        while (true) {
            System.out.print("Enter 0 to exit: ");
            number = 0; //scanner.nextInt();
            switch (number) {
                case 0:
                    break menu;
                default:
                    System.out.println("Your choice: " + number);
                    break;
            }
        }

        // вивести перші 10 простих чисел.
        // ці числа можна поділити тільки на 1 і на саме число
        int foundNumbers = 0;
        number = 0;
        next:
        while (foundNumbers < 10) {
            number++;
            // цикл від 2 до sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number != i && number % i == 0) {
                    continue next;
                }
            }
            System.out.print(number + " ");
            foundNumbers++;
        }
    }
}
