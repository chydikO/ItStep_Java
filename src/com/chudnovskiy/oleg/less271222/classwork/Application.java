package com.chudnovskiy.oleg.less271222.classwork;

import java.util.Arrays;

public class Application {
    static void stringDemo() {
        char[] charArrayMassage = {72, 'e', 'l', 'l', 'o', '.'};
//        for (char ch: charArrayMassage) {
//            System.out.println("code: " + ((int)ch) + " symbol: " + ch);
//        }
        System.out.println(charArrayMassage);
        String message = "Hello";
        System.out.println(message);
        message = new String(charArrayMassage);
        System.out.println(message);

        // Strings are immutable objects
        charArrayMassage[charArrayMassage.length - 1] = '!';
        System.out.println(charArrayMassage);
        System.out.println(message.replace('.', '!'));
        System.out.println(message);

        // String methods
        int len = message.length();
        System.out.println("len = " + len);
        char firstLetter = message.charAt(0);
        System.out.println(firstLetter);
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        // equals()
        String str1 = "String";
        String str2 = new String(str1); //"String";
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        char[] arr1 = {'t', 'e', 's', 't'};
        char[] arr2 = {'t', 'e', 's', 's'};
        System.out.println("(arr1 == arr2) = " + (arr1 == arr2));
        boolean isArraysEquals = arr1.length == arr2.length;
//        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
//            if (arr1[i] != arr2[i]) {
//                isArraysEquals = false;
//                break;
//            }
//        }
        isArraysEquals = Arrays.equals(arr1, arr2);
        System.out.println("isArraysEquals = " + isArraysEquals);
        System.out.println("\"test\".equals(\"Test\") = " + "test".equals("Test"));
        System.out.println("\"test\".toLowerCase().equals(\"Test\".toLowerCase()) = " + "test".toLowerCase().equals("Test".toLowerCase()));
        System.out.println("\"test\".equalsIgnoreCase(\"Test\") = " + "test".equalsIgnoreCase("Test"));
        message = "Hello. World.";
        int index = message.indexOf(".");
        System.out.println("index = " + index);
        index = message.lastIndexOf("."); //message.indexOf(".", 6);
        System.out.println("index = " + index);

        System.out.println("message.contains(\".\") = " + message.contains("."));
        System.out.println("message.startsWith(\"Hello\") = " + message.startsWith("Hello"));
        System.out.println("message.endsWith(\".\") = " + message.endsWith("."));

        String s = "abcdef";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(i) = " + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        // stringDemo();
        selectionSortingDemo();
    }

    private static void selectionSortingDemo() {
        String[] sarr = {"ccc", "bb", "dddd", "fffff", "eeeee", "gggggg", "a"};
        for (int i = 0; i < sarr.length; i++) {
            int min = i;
            for (int j = i + 1; j < sarr.length; j++) {
                if (sarr[j].length() < sarr[min].length()) {
                    min = j;
                }
            }
            if (min != i) {
                String tmp = sarr[i];
                sarr[i] = sarr[min];
                sarr[min] = tmp;
            }
        }
        System.out.println(Arrays.toString(sarr));
    }
}

