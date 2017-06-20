package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-20.
 */
public class MergeSortTest {

    @Test
    public void test1() {
        MergeSort sort = new MergeSort();
        int[] arr = new int[]{38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = sort.mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    @Test
    public void test2() {
        MergeSort sort = new MergeSort();
        int[] arr = new int[]{8, 7, 6, 5, 44, 3, 22, 1};
        int[] sortedArr = sort.mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
