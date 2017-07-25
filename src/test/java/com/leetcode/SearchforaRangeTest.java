package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SearchforaRangeTest {
    @Test
    public void test() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        SearchforaRange s = new SearchforaRange();
        int[] ints = s.searchRange(arr, 8);
        System.out.println(Arrays.toString(ints));
        Assert.assertArrayEquals(new int[]{3, 4}, ints);
    }

    @Test
    public void test1() {
        int[] arr = {1};
        SearchforaRange s = new SearchforaRange();
        int[] ints = s.searchRange(arr, 1);
        System.out.println(Arrays.toString(ints));
        Assert.assertArrayEquals(new int[]{0, 0}, ints);
    }

    @Test
    public void test2() {
        int[] arr = {2, 2};
        SearchforaRange s = new SearchforaRange();
        int[] ints = s.searchRange(arr, 2);
        System.out.println(Arrays.toString(ints));
        Assert.assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3};
        SearchforaRange s = new SearchforaRange();
        int[] ints = s.searchRange(arr, 1);
        System.out.println(Arrays.toString(ints));
        Assert.assertArrayEquals(new int[]{0, 0}, ints);
    }
}
