package com.chudnovskiy.oleg.less10012023.homework;
import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Задание 7. Палиндром
 * Дано предложение, состоящее только из строчных ла-
 * тинских букв. Проверьте, являются ли слова в предложении
 * палиндромом. Выведите YES или NO.
 * Ввод: radar yes
 * Вывод: YES NO
 */
public class Task07 {
    public static void main(String[] args) {
        assertTrue(isPalindrome("radar"));
        assertFalse(isPalindrome("car"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input you word:\t");
        String string = scanner.nextLine();

        System.out.println(isPalindrome(string) ? "yes" : "no");
    }
    static boolean isPalindrome(String str) {
        if (str.length() <= 1)  {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
