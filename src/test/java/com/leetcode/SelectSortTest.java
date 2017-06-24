package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-25.
 */
public class SelectSortTest {
    @Test
    public void test1() {
        int[] arr = new int[]{15, 11, 1, 3, 8};
        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
