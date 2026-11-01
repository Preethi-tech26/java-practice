package junitdemo;

import java.util.Arrays;


public class SortOnesFirst2 {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 1, 0};
        //int[] a = {1, 1, 1};
        //{1, 1, 0, 0}
        //{0, 0, 0}

        System.out.println("Before: " + Arrays.toString(a));
        sortOnesFirst2(a);
        System.out.println("After:  " + Arrays.toString(a));
    }

    public static void sortOnesFirst2(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            // move left forward past 1s
            while (left < right && a[left] == 1) {
                left++;
            }
            // move right backward past 0s
            while (left < right && a[right] == 0) {
                right--;
            }
            // now a[left] is a 0 and a[right] is a 1: swap them
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
}
