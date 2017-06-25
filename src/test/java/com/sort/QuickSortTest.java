package com.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-25.
 */
public class QuickSortTest {
    @Test
    public void test(){
        QuickSort sort= new QuickSort();
        int[] arr = new int[]{38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = sort.sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    @Test
    public void test1(){
        QuickSort sort= new QuickSort();
        int[] arr = new int[]{8, 7, 6, 5, 44, 3, 22, 1};
        int[] sortedArr = sort.sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
