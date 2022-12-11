package com.chudnovskiy.oleg.lesson4.classwork;
import static com.chudnovskiy.oleg.lesson3.homework.Util.scanner;

/**
 * Комп'ютер загадує число від 1 до 100 (включно)
 * Гравець повинен вгадати це число
 * Для цього вказується число і комп'ютер підказує чи вгадане число, чи число, що було загадане менше, чи більше
 * Приклад
 *
 * Гра "Вгадай число".
 *
 * Число загадане від 1 до 100.
 *
 * Введіть загадане число: 50
 * Загадане число більше
 *
 * Введіть загадане число: 75
 * Вірно. Загадане число 75!
 *
 * Кінець гри.
 */
public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(" Гра \"Вгадай число\"");
        System.out.print("Число загадане від 1 до 100.");
        int numberUser;
        int numberComp = (int)Math.floor(Math.random() * 100);

        do {
            System.out.print("Введіть загадане число: ");
            numberUser = scanner.nextInt();
            if (numberUser > numberComp) {
                System.out.println("Загадане число меньше.");
            } else if (numberUser < numberComp) {
                System.out.println("Загадане число більше.");
            } else {
                System.out.println("Вірно. Загадане число " + numberComp);
            }
        } while (numberUser != numberComp);
        System.out.println("Кінець гри.");
    }
}
