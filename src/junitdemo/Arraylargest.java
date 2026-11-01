package junitdemo;

public class Arraylargest {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 7, 2, 7};
        //Find the largest number and the sum of numbers
        int max = nums[0];
        int length = nums.length;
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sum += nums[i];

        }
        System.out.println("The largest number is " + max);
        System.out.println("The sum of the numbers is " + sum);
    }
}
