package com.chudnovskiy.oleg.less081221.classwork;

public class Geometric2 {
    public static void main(String[] args) {

        System.out.println("Введите размер");
//        Scanner sc = new Scanner(System.in);
        int num = 10;

        System.out.println();
        System.out.println("Ромб");
        int z = 1;
        for (int i = 0; i < num / 2 + 1; i++) {
            int prob = (num - z) / 2;

            for (int j = 0; j < prob; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();

            z = z + 2;
        }
        z = num - 2;
        //===
        for (int i = num / 2; i > 0; i--) {
            int prob = (num - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z - 2;
        }

        System.out.println("Равносторонний треугольник");
        for (int i = 1; i <= num; ++i){

            for (int j = num; j > i; --j)
                System.out.print("-");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }

        System.out.println("Усовершенствованный ромб");
        for (int i = 1; i < num/2; ++i){ //Сделать ромб в 2 раза меньше num/2

            for (int j = num/2; j > i; --j)
                System.out.print("-");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        for (int i = num/2; i >= 1; --i){ //Сделать ромб в 2 раза меньше num/2

            for (int j = num/2; j > i; --j)
                System.out.print("-");

            for (int j = 1; j < i*2; ++j)
                System.out.print("*");

            System.out.println();
        }
    }
}
