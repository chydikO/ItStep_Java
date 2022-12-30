package com.chudnovskiy.oleg.less271222.homework;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 1. Написати статичний метод isPalindrom(), що приймає в якості аргумента рядок і повертає булеве значення в залежності
 * від того чи є рядок палідромом чи ні (порівнювати потрібно без урахування регістру симолів, знаків пробілу і табуляції,
 * розділових знаків .,!:;?-).
 * <p>
 * Що таке паліндром? https://uk.wikipedia.org/wiki/%D0%9F%D0%B0%D0%BB%D1%96%D0%BD%D0%B4%D1%80%D0%BE%D0%BC
 * <p>
 * Приклади паліндромів:
 * * Уму - мінімуму!
 * * Козак з казок.
 * * Мадам
 * * Випив
 * * Ні, не Ленін!
 */
public class Task01 {
    public static void main(String[] args) {
        assertTrue(isPalindrome("Мадам"));
        assertTrue(isPalindrome("Випив"));
        assertTrue(isPalindrome("Уму - мінімуму!"));
        assertTrue(isPalindrome("Козак з казок"));
        assertTrue(isPalindrome("Ні, не Ленін!"));
        assertTrue(isPalindrome("9Ні, не Ленін!9"));

        assertFalse(isPalindrome("Випив0a"));
        assertFalse(isPalindrome("Ні, не 9Ленін!"));
    }

    private static boolean isPalindrome(String string) {
        string = removeUnwantedCharacters(string).toLowerCase();
        int i = string.length() - 1;
        int j = 0;
        while (i > j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private static String removeUnwantedCharacters(String string) {
        int i;
        int len = string.length();
        StringBuffer stringBuffer = new StringBuffer(len);
        char charAt;

        for (i = 0; i <= len - 1; i++) {
            charAt = string.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
