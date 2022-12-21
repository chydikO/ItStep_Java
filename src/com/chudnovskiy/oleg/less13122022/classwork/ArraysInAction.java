package com.chudnovskiy.oleg.less13122022.classwork;

import java.util.Arrays;

public class ArraysInAction {
    public static void main(String[] args) {
        int[] marks = {4, 7, 11, 10, 9};
        System.out.println("marks.length = " + marks.length);
        System.out.println("Arrays.toString(marks) = " + Arrays.toString(marks));
        // 1. Expand size
//        int[] newMarks = new int[marks.length + 1]; // new array length + 1
//        for (int i = 0; i < marks.length; i++) { // copy to new array all values
//            newMarks[i] = marks[i];
//        }
//        marks = newMarks; // copy reference to new array
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = 10;
        System.out.println("marks.length = " + marks.length);
//        System.out.println("Arrays.toString(newMarks) = " + Arrays.toString(newMarks));
        System.out.println("Arrays.toString(marks) = " + Arrays.toString(marks));
//        newMarks[0] = -100;
//        System.out.println("Arrays.toString(newMarks) = " + Arrays.toString(newMarks));
//        System.out.println("Arrays.toString(marks) = " + Arrays.toString(marks));

        // 2. Reduce size
        int[] tmp = new int[marks.length - 1];
        System.arraycopy(marks, 0, tmp, 0, tmp.length);
        marks = tmp;
        System.out.println("Arrays.toString(marks) = " + Arrays.toString(marks));

        // 3. Statistics
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + ((double) sum / marks.length));
    }
}
