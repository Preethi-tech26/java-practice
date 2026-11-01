package junitdemo;

import java.util.Arrays;


public class Count1and0Array {
    public static void main(String[] args) {
        int[] a1 = {0, 1, 0, 1, 0, 1};
        //int[] a1 = {1, 0};
        System.out.println("Before: " + Arrays.toString(a1));
        sortOnesFirst(a1);
        System.out.println("After:  " + Arrays.toString(a1));
    }

    public static void sortOnesFirst(int[] a1) {
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i < a1.length; i++)
            if (i < count) {
                a1[i] = 1;
            } else
                a1[i] = 0;

    }

}

