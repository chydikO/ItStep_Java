package com.chudnovskiy.oleg.less091222.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 2. Написать программу проверки умения складывать и вычитать
 * числа в пределах 100. Программа должна вывести 10 примеров,
 * причем в каждом примере уменьшаемое должно быть больше или
 * равно вычитаемому, т. е. не допускается предлагать испытуемому
 * примеры с отрицательным результатом. Оценка выставляется по
 * следующему правилу: за 10 правильных ответов — "отлично",
 * за 9 и 8 — "хорошо", за 7 и 6 — "удовлетворительно", за 6 и ме-
 * нее — "плохо". Ниже приведен рекомендуемый вид экрана про-
 * граммы.
 * Проверка умения складывать и вычитать числа.
 * После примера введите ответ и нажмите <Enter>
 * 75-4=71
 * 35-9=29
 * Вы ошиблись! 35-9=26
 * 14-1=13
 * 6-5=1
 * 37-19=28
 * Вы ошиблись! 37-19=18
 * 53-14=39
 * 94-87=7
 * 90-16=74
 * 4-2=2
 * 89-41=48
 * Правильных ответов: 8
 * Оценка: Хорошо
 */
public class Task02 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int TASK_NUMBER = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int result, resultFromUser;
        int number1, number2;
        int grade = 10;
        boolean randomOperations;

        System.out.println("Проверка умения складывать и вычитать числа.");
        System.out.println("После примера введите ответ и нажмите <Enter>");

        for (int i = 0; i < TASK_NUMBER; i++) {
            number1 = getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            number2 = getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            randomOperations = getRandomNBoolean();

            if (!randomOperations && number1 < number2) {
                do {
                    number1 = getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
                } while (number1 < number2);
            }

            String resultString = number1 + " " + getOperationSign(randomOperations) + " " + number2 + " = ";
            System.out.print(resultString);
            resultFromUser = randomOperations ? number1 + number2 : number1 - number2;
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
            default -> result = "плохо";
        }
        return result;
    }

    private static boolean isTrueAnswer(int result, int resultFromUser) {
        return result == resultFromUser;
    }

    public static int getRandomNumber(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static boolean getRandomNBoolean() {
        return random.nextBoolean();
    }

    private static String getOperationSign(boolean operation) {
        return operation ? "+" : "-";
    }
}
