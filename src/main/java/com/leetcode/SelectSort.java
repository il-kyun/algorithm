package com.leetcode;

/**
 * Created by IK on 2017-06-25.
 */
public class SelectSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
        return arr;
    }

    private void swap(int[] arr, int src, int trg) {
        int temp = arr[src];
        arr[src] = arr[trg];
        arr[trg] = temp;
    }
}
