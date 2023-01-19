package com.chudnovskiy.oleg.less10012023.homework;

/**
 * Задание 1
 * Даны два целых числа A и В. Выведите все числа от A до
 * B включительно, в порядке возрастания, если A < B, или в
 * порядке убывания – в противном случае.
 * Ввод: 5 1
 * Вывод: 5 4 3 2 1
 */
public class Task01 {
    public static void main(String[] args) {
        func(5, 1);
    }

    static void func(int start, int stop) {
        if (start == stop) {
            return;
        }
        if (start < stop) {
            System.out.println(start);
            func(start + 1, stop);
        } else {
            System.out.println(start);
            func(start - 1, stop);
        }
    }
}
