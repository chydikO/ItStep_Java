package com.chudnovskiy.oleg.less120123.homework;

import java.util.regex.Pattern;

public class HomeTask {
    public static void main(String[] args) {
/*        String string = "Привет Мир";
//        String string = "Hello World";
        StringBuilder result = new StringBuilder(string.length());
        int shift = 12;


        System.out.println(result.toString());*/
        String message = "RegExr was created 1899 by gskinner.com. Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported!.";

//        message = "мама мыла раму и я";
        String codeMessage = codingAndEncodingMessage(message, 12);
        System.out.println(message + " -> " + codeMessage);
        String deCodeMessage = codingAndEncodingMessage(codeMessage, - 12);
        System.out.println(codeMessage + " -> " + deCodeMessage);

        message = "hello zzz aaa";
         codeMessage = codingAndEncodingMessage(message, 14);
        System.out.println(message + " -> " + codeMessage);
        deCodeMessage = codingAndEncodingMessage(codeMessage, -14);
        System.out.println(codeMessage + " -> " + deCodeMessage);

        message = "мама мыла раму и я";
        codeMessage = codingAndEncodingMessage(message, 14);
        System.out.println(message + " -> " + codeMessage);
        deCodeMessage = codingAndEncodingMessage(codeMessage, -14);
        System.out.println(codeMessage + " -> " + deCodeMessage);
    }

    private static String codingAndEncodingMessage(String message, int key) {
        char tmp;
        char firstCharAlfabet;
        char lastCharAlfabet;
        StringBuilder strBox = new StringBuilder(message.length());

        //boolean isEnglish = Pattern.matches("[A-Za-z ]+", message);
        boolean isEnglish = Pattern.matches("[A-Za-z0-9 !\"`'#%\\-&.,:;<>=@{}~$()*+/?\\[\\]^|]*", message);
        if (isEnglish) {
            firstCharAlfabet = 'a';
            lastCharAlfabet = 'z';
        } else {
            firstCharAlfabet = 'а';
            lastCharAlfabet = 'я';
        }
        int countCharsAlphabet = (lastCharAlfabet - firstCharAlfabet) + 1;

        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % countCharsAlphabet;
                if (tmp > lastCharAlfabet)
                    tmp = (char)(tmp % lastCharAlfabet + firstCharAlfabet - 1);
                else if (tmp < firstCharAlfabet)
                    tmp = (char)(tmp + countCharsAlphabet);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }
}
/*
hello zzz aaa! -> vszzc nnn ooo!
vszzc nnn ooo! -> hello zzz aaa!
мама мыла раму и я -> ъоъо ъйщо юоъб ц н
ъоъо ъйщо юоъб ц н -> мама мыла раму и я
 */