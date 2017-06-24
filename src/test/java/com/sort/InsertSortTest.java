package com.sort;

import com.sort.InsertSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-24.
 */
public class InsertSortTest {

    @Test
    public void test1() {
        int[] arr = new int[]{15, 11, 1, 3, 8};
        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void test2() {
        int[] arr = new int[]{15, 11, 1, 3, 8, 2, 99, 13};
        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
