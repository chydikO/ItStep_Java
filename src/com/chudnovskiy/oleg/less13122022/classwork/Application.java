package com.chudnovskiy.oleg.less13122022.classwork;

public class Application {
    public static void main(String[] args) {
        int mark1 = 7;
        int mark2 = 9;
        int mark3 = 10;
        int mark4 = 8;
        int mark5 = 9;
        int mark6 = 12;

        System.out.println("mark1 = " + mark1);

        String[] homeworks = {
                "Hello World",
                "Variables",
                "Conditions",
                "Loops",
                "Arrays",
                "Static methods",
                "Recursion"
        };
        System.out.println(homeworks[0]);
        int[] marks = {7, 9, 10, 8, 9, 12}; //new int[6];
        System.out.println("marks[0] = " + marks[0]);
//        System.out.println("marks = " + marks);
        System.out.println("marks.length = " + marks.length);
        System.out.print("marks = [");
//        System.out.print(marks[0] +", ");
//        System.out.print(marks[1] +", ");
//        System.out.print(marks[2] +", ");
//        System.out.print(marks[3] +", ");
//        System.out.print(marks[4] +", ");
//        System.out.println(marks[5] + "]");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ((i != marks.length - 1) ? ", " : ""));
//            if (i != marks.length - 1) {
//                System.out.print(", ");
//            }
        }
        System.out.println("]");
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }
        // <condition> ? <if true> : <else>
        System.out.println((a > b) ? "a > b" : "a <= b");
    }
}
