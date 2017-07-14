package com.sort;

/**
 * Created by IK on 2017-06-24.
 */
public class BubbleSort {
    public int[] sort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    flag = true;
                }
            }
        }
        return arr;
    }

    public int[] sort_n2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int src, int trg) {
        int temp = arr[src];
        arr[src] = arr[trg];
        arr[trg] = temp;
    }
}
