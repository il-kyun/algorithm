package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-24.
 */
public class BubbleSortTest {
    @Test
    public void test1() {
        int[] arr = new int[]{15, 11, 1, 3, 8};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void test2() {
        int[] arr = new int[]{15, 11, 1, 3, 8,17,19};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void test3() {
        int[] arr = new int[]{15};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void test4() {
        int[] arr = new int[]{};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
