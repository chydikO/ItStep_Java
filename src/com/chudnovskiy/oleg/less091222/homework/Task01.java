package com.chudnovskiy.oleg.less091222.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Написать программу проверки знания таблицы умножения.
 * Программа должна вывести 10 примеров и выставить оценку: за
 * 10 правильных ответов — "отлично", за 9 и 8 — "хорошо", за 7 и
 * 6 — "удовлетворительно", за 6 и менее — "неудовлетворитель-
 * но". Ниже приведен рекомендуемый вид экрана программы.
 * *** Проверка знания таблицы умножения ***
 * После примера введите ответ и нажмите <Enter>.
 * 5x3=15
 * 7х7=49
 * 1х4=4
 * 4х3=12
 * 9х4=36
 * 8х8=64
 * 7х8=52
 * Вы ошиблись! 7х8=56
 * 4х7=28
 * 3х5=15
 * 2х5=10
 * Правильных ответов: 9
 * Оценка: Хорошо.
 */
public class Task01 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int TASK_NUMBER = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int result, resultFromUser;
        int number1, number2;
        int grade = 10;

        System.out.println("*** Проверка знания таблицы умножения ***");
        System.out.println("После примера введите ответ и нажмите <Enter>.");

        for (int i = 0; i < TASK_NUMBER; i++) {
            number1 = getRandomIndex(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            number2 = getRandomIndex(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            String resultString = number1 + " X " + number2 + " = ";
            System.out.print(resultString);
            resultFromUser = number1 * number2;
            result = scanner.nextInt();

            if (!isTrueAnswer(result, resultFromUser)) {
                System.out.println("Вы ошиблись! " + resultString + resultFromUser);
                grade--;
            }
        }
        System.out.println("Правильных ответов:\t" + grade);
        System.out.println(getGradeToString(grade));
    }

    private static String getGradeToString(int grade) {
        String result;
        switch (grade) {
            case 10 -> result = "отлично";
            case 8, 9 -> result = "хорошо";
            case 7, 6 -> result = "удовлетворительно";
            default -> result = "не удовлетворительно";
        }
        return result;
    }

    private static boolean isTrueAnswer(int result, int resultFromUser) {
        return result == resultFromUser;
    }

    public static int getRandomIndex(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
