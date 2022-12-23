package org.itstep;

import java.util.Arrays;

public class Application {

    // [public|private|protected] static <return type> <method_name>([<arg type> <arg name>, ...]) {
    //      // body
    //      // return <value>;
    // }

    // define method (визначення методу)
    static void hello() {
        System.out.println("Hello World!");
    }

    static void hello(String name) { // name - parameter
        System.out.println("Hello " + name + "!");
    }

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i != arr.length - 1 ? "; " : ""));
        }
        System.out.println("]");
    }

    static void min(int a, int b) {
        System.out.println(Math.min(a, b));
    }

    static String toString(String[] arr) {
        String str = "["; // local variable
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + (i != arr.length - 1 ? "; " : "");
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        int a; int b, c;
        System.out.println("\"\"");
        System.out.println("args.length = " + args.length);
        System.out.println("Arrays.toString(args) = " + toString(args));
        int[] arr = {1, 2};
        print(arr);
        int[] arr2 = {1, 2, 3, 4};
        print(arr2);
        int[] arr3 = {1, 2, 4};
        print(arr3);
        // статичні методи - іменований блок коду який можна викликати без створення
        // екземпляру класу
        int max = Math.max(1, 2);
        min(1, 2);
        Application.hello(); // method invocation (виклик методу)
        hello();
        hello("Vasja"); // "Vasja" - argument

        // сортування вибором
    }
}
