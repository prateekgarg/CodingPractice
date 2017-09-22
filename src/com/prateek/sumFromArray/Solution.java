package com.prateek.sumFromArray;

import java.util.HashSet;

class Solution {
    public static void main(String args[]) {
        int[] solution = twoSum(new int[]{1, 2, 3, 4}, 6);
        System.out.println(solution[0] + " " + solution[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;
            if (hs.contains(second)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }
}
