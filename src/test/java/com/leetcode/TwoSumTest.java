package com.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Stopwatch;

/**
 * Created by IK on 2017-06-18.
 */
public class TwoSumTest {
    private long start;
    @Before
    public void before(){
        start = System.currentTimeMillis();
    }

    @After
    public void after(){
        long end = System.currentTimeMillis();
        System.out.println("spent time : " + (end - start));
    }

    @Test
    public void test1(){
        long startMillis = System.currentTimeMillis();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSumWithBruteForce(nums, target);
        Assert.assertArrayEquals(new int[]{0,1}, ints);

        int[] ints1 = twoSum.twoSumWithTwoPassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{0,1}, ints1);

        int[] ints2 = twoSum.twoSumWithOnePassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{0,1}, ints2);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{2,7,11,15};
        int target = 18;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSumWithBruteForce(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints);

        int[] ints1 = twoSum.twoSumWithTwoPassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints1);

        int[] ints2 = twoSum.twoSumWithOnePassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints2);
    }

    @Test
    public void test3(){
        int[] nums = new int[]{3,2,4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSumWithBruteForce(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints);

        int[] ints1 = twoSum.twoSumWithTwoPassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints1);

        int[] ints2 = twoSum.twoSumWithOnePassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{1,2}, ints2);
    }

    @Test
    public void test4(){
        int[] nums = new int[]{3,5,7,2,12};
        int target = 14;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSumWithBruteForce(nums, target);
        Assert.assertArrayEquals(new int[]{3,4}, ints);

        int[] ints1 = twoSum.twoSumWithTwoPassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{3,4}, ints1);

        int[] ints2 = twoSum.twoSumWithOnePassHashTable(nums, target);
        Assert.assertArrayEquals(new int[]{3,4}, ints2);
    }



}