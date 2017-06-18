package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IK on 2017-06-18.
 */
public class TwoSum {
    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * <p>
     * n^2
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumWithBruteForce(int[] nums, int target) {
        int[] rtn = new int[2];

        //brute force
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    rtn[0] = i;
                    rtn[1] = j;
                    return rtn;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumWithTwoPassHashTable(int[] nums, int target) {
        int[] rtn = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //one pass hash table
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                rtn[0] = i;
                rtn[1] = map.get(target - nums[i]);
                return rtn;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSumWithOnePassHashTable(int[] nums, int target) {
        int[] rtn = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //one pass hash table
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                rtn[0] = map.get(target - nums[i]);
                rtn[1] = i;
                return rtn;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}