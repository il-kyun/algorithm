package com.leetcode;

public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && result[0] == -1) {
                result[0] = i;
            } else if (nums[i] > target && result[0] != -1) {
                result[1] = i - 1;
                break;
            }
        }
        if (result[0] != -1 && result[1] == -1) {
            result[1] = nums.length - 1;
        }
        return result;
    }
}