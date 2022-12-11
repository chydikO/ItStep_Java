package com.chudnovskiy.oleg.lesson4.classwork;

/**
 * Написати програму в якій виводиться через цикл for послідовність чисел від 10 до 0 з кроком 1.
 * Після чого виводиться повідомлення "Полетіли!"
 *
 * Приклад виводу:
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 * Полетіли!
 */
public class PracticeOnFor {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("Полетіли!");
    }
}
