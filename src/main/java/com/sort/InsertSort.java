package com.sort;

/**
 * Created by IK on 2017-06-24.
 */
public class InsertSort {
    public int[] sort(int[] arr) {
        int temp = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
