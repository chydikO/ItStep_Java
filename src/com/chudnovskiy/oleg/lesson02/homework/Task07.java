package com.chudnovskiy.oleg.lesson02.homework;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Задание 7
 * Разработать программу, которая позволит при известном
 * годовом проценте вычислить сумму вклада в банке через
 * два года, если задана исходная величина вклада.
 */
public class Task07 {
    private static final double PERCENT = 4.7d;
    private static final double DEPOSIT_AMOUNTS = 200.0d;
    private static final int DEPOSIT_TIME = 2;

    public static void main(String[] args) {

        double income  = (DEPOSIT_AMOUNTS * PERCENT * (double) DEPOSIT_TIME)/ 100;
        double depositAmount = income + DEPOSIT_AMOUNTS;

        MathContext context = new MathContext(4, RoundingMode.HALF_UP);
        BigDecimal roundingIncome = new BigDecimal(income, context);
        BigDecimal roundingDepositAmount = new BigDecimal(depositAmount, context);

        System.out.println("deposit income two years\t" + roundingIncome);
        System.out.println("bank deposit amount two years\t" + roundingDepositAmount);
    }

}
