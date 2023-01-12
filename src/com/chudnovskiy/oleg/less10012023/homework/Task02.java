package com.chudnovskiy.oleg.less10012023.homework;
import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Задание 2. Точная степень двойки
 * Дано натуральное число N. Выведите слово YES, если число
 * N является точной степенью двойки, или слово NO – в про-
 * тивном случае.
 * Операцией возведения в степень пользоваться нельзя!
 * Ввод: 3 8
 * Вывод: NO YES
 */
public class Task02 {
    public static void main(String[] args) {
        assertFalse(isPowerOfTwo(3));
        assertTrue(isPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int number) {
        if(number == 2) {
            return true;
        }

        if(number % 2 != 0) {
            return false;
        } else {
            return isPowerOfTwo(number / 2);
        }
    }
}
