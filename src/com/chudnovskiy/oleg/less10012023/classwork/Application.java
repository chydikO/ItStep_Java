package com.chudnovskiy.oleg.less10012023.classwork;

public class Application {
    public static void main(String[] args) {
        String s = "Masha Efrosinina:   \n (012) 345 67 89\t\n\r\t";
        int colonIndex = s.indexOf(':');
        String phone = s.substring(colonIndex + 1);
        phone = phone.trim();
        System.out.println(phone);
        phone = phone.replace(" ", "-");
        System.out.println(phone);

        String[] parts =  s.split(":");
        for (String str: parts)  {
            System.out.println(str.trim());
        }

        s = "Hello. World. Test";
        String[] words = s.split("\\."); // be careful with symbol . in split method
        for (String word: words) {
            System.out.println(word.trim());
        }

        // s = "";
        // String - immutable
        // StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            //s += i + " ";
            stringBuilder.append(i).append(" ");
        }
        s = stringBuilder.toString();
        System.out.println(s);
    }
}
