package com.chudnovskiy.oleg.lesson4.classwork;

import java.util.Locale;
import java.util.Scanner;

public class Lesson4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input month:\t");
        String month = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (month) {
            case "january", "february", "december":
                System.out.println("Winter");
                break;

                case "march", "april", "may":
                System.out.println("Spring");
                break;

                case "june", "july", "august":
                System.out.println("Summer");
                break;

                case "september", "october", "november":
                System.out.println("Autumn");
                break;

            default:
                System.out.println("-= there is no such month =-");
        };
    }
}
