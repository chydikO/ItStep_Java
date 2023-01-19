package com.chudnovskiy.oleg.less120123.homework;

import java.util.Scanner;

public class Task01 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String massage = inputMassage();
        int key = inputKey();

        String encryptMassage = encryptDecryptMassage(key, massage);
        String decryptMessage = encryptDecryptMassage(-key, encryptMassage);

        System.out.println("Encrypt Massage:\t" + encryptMassage);
        System.out.println("Decrypt Message:\t" + decryptMessage);
    }

    private static String encryptDecryptMassage(int key, String massage) {
        StringBuilder stringBuilder = new StringBuilder(massage.length());
        for (int i = 0; i < massage.length(); i++) {
            stringBuilder.append((char)(massage.charAt(i) + (char)key));
        }
        return stringBuilder.toString();
    }

    private static int inputKey() {
        System.out.print("Input decrypt key:\t");
        return scanner.nextInt();
    }

    private static String inputMassage() {
        System.out.print("Input you message:\t");
        return scanner.nextLine();
    }
}
