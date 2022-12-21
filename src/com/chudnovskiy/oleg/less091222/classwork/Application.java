package com.chudnovskiy.oleg.less091222.classwork;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // System, Scanner, Math, String
        // class Math
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
        // square root (sqrt)
        System.out.println("Math.sqrt(81) = " + Math.sqrt(81));
        System.out.println("Math.pow(2, 8) = " + Math.pow(2, 8));
        System.out.println("Math.abs(-10) = " + Math.abs(-10));
        System.out.println("Math.max(10, 1) = " + Math.max(10, 1));
        System.out.println("Math.min(10, 1) = " + Math.min(10, 1));
        double r = Math.cos(Math.toRadians(90));
        if (Math.abs(r) < 1E-3) {
            System.out.println("It is zero");
        }
        System.out.println("Math.cos(Math.toRadians(90)) = " + r);
        System.out.println("Math.ceil(1.1) = " + Math.ceil(1.1));
        System.out.println("Math.floor(1.6) = " + Math.floor(1.6));
        System.out.println("Math.round(1.4) = " + Math.round(1.4));
        System.out.println("Math.round(1.6) = " + Math.round(1.6));

        System.out.println("Math.random() = " + Math.random());
        int random = (int) (Math.random() * 100);
        System.out.println("random = " + random);

        // class Random
        // currentTimesMills - time in mills since the 1st of January 1970
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        Random rnd = new Random(10);
        //rnd.nextInt(1, 100);
        for (int i = 0; i < 10; i++) {
            random = rnd.nextInt(100); // [0, 100)
            System.out.println("rnd = " + random);
        }

        // array
        int number = 1;
        //           0  1  2
        int[] arr = {1, 2, 3}; // java style
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        int arr2[];// C style
    }
}
