package junitdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountOccurrenceHashMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        System.out.println("Enter the word to count the number of letter occurrences");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println("The letter: " + e.getKey() + " occurs : " + " " + e.getValue() + " time(s)");
        }
        int[] numbs = {4, 4, 4, 7, 2, 7};
        Map<Integer, Integer> numberCounts = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            numberCounts.put(numbs[i], numberCounts.getOrDefault(numbs[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : numberCounts.entrySet()) {
            System.out.println("The number of occurrence of " + e.getKey() + " is: " + e.getValue());
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " is a duplicate");
            }
        }
    }
}
