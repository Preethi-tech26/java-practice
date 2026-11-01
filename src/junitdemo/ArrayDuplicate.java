package junitdemo;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 7, 2, 7};
        //Find the duplicates in the array
        for (int i = 0; i < nums.length; i++) {
            boolean seenBefore = false;
            // look at the positions BEFORE i
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    seenBefore = true;
                }
            }
            if (seenBefore) {
                continue;   // already reported earlier, skip to the next i
            }
            // look at the positions AFTER i
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    System.out.println(nums[i] + " is a duplicate");
                    break;  // one match is enough, stop looking
                }
            }
        }

    }
}