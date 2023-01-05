package com.chudnovskiy.oleg.less061222.homework;

/**
 * Задание 4
 * Совершенное число – натуральное число, равное сумме всех своих собственных делителей (то есть всех положительных делителей,
 * отличных от самого числа).Показать на экране все совершенные числа в диапазоне от 0 до 1 000 000.
 * Примеры:
 * 1-е совершенное число: 6 имеет следующие собственные делители – 1, 2, 3; их сумма равна 6.
 * 2-е совершенное число: 28 имеет следующие собственные делители: – 1, 2, 4, 7, 14; их сумма равна 28.
 */
public class Task04 {
    public static void main(String[] args) {
        /*for (double n = 0; n <= 1_000_000; n++) {
            double sum = 0;
            for (double div = 1; div < n; div++) {
                if (n % div == 0)
                    sum += div;
            }
            if (sum == n) {
                System.out.println(n);        }
        }*/
        for (int i = 0; i < 1_000_000; i++) {
            if (isPerfect(i) == true) {
                System.out.println(i);
            }
        }

    }
    private static boolean isPerfect(int n)
    {
        int sum = 0;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                if (n / i == i)
                    sum += i;
                else
                {
                    sum += i;
                    sum += n / i;
                }
            }
        }
        if (n == sum - n) {
            return true;
        }
        return false;
    }
}
