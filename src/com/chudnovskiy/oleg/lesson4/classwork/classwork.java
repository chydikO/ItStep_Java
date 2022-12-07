package com.chudnovskiy.oleg.lesson4.classwork;

public class classwork {

        public static void main(String[] args) {
            // boolean: true, false
            // >, <, >=, <=, !=, ==
            // &&, ||, !
            // if(<condition>) {
            //    <body>
            // }
            // if(<condition1>) {
            //   <body1>
            // } else {
            //   <body2>
            // }
            // if(<condition1>) {
            //   <body1>
            // } else if(<condition2>) {
            //   <body2>
            // } else if(<condition3>) {
            //    ...
            //  } else {
            //    ....
            // }

            // switch
            int month = 1;
            // show name of month
            // using if
            if (month == 1) {
                System.out.println("Jan");
            } else if (month == 2) {
                System.out.println("Feb");
            } else if (month == 3) {
                System.out.println("Mar");
            } // ... Dec
            // using switch
            switch (month) {
                case 1: // if(month == 1)
                    System.out.println("Jan");
                    break;
                case 2: // else if (month == 2)
                    System.out.println("Feb");
                    break;
                case 3: // else if (month == 3)
                    System.out.println("Mar");
                    break;
                //...
                default:
                    System.out.println("Other");
                    break;
            }
            // Long Term Support (LTS) java version: 8, 11, 17
            // switch new style (since 17 LTS)
            switch (month) {
                case 1 -> System.out.println("Jan");
                case 2 -> System.out.println("Feb");
                case 3 -> System.out.println("Mar");
                //...
                default -> System.out.println("Other");
            }
            String monthName = switch (month) {
                case 1 -> "Jan";
                case 2 -> "Feb";
                case 3 -> "Mar";
                default -> "Other";
            };
            System.out.println(monthName);
        }
    }

