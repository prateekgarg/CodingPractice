package com.prateek.sumFromArray;

import java.util.HashSet;

class Solution {
    public static void main(String args[]) {
        /*
        Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        * */
        int[] solution = twoSum(new int[]{1, 2, 3, 4}, 6);      //should return 1 3
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
                //executed only once, so the complexity is still linear
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
