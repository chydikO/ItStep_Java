package com.chudnovskiy.oleg.less10012023.classwork;

import java.io.Reader;
import java.util.Scanner;

/**
 * Практика на StringBuilder
 * Користувач вводить з клавіатури рядок
 * Рядок перетворюється наступним чином: кожна голосна літера (a, e, i, o, u) стає великою, приголосні - маленькими
 * Приклад
 *
 * >>> Hello World
 * hEllO wOrld
 */
public class ClassTask {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String string = scanner.nextLine();

        String string = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(string.length());

        String vowels = "aeiou";
        for (char charBox : string.toLowerCase().toCharArray()) {
            if (Character.isLetter(charBox)) {
                if (vowels.indexOf(charBox) == -1) {
                    stringBuilder.append(Character.toString(charBox).toLowerCase());
                } else {
                    stringBuilder.append(Character.toString(charBox).toUpperCase());
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
