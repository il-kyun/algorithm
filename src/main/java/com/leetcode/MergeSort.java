package com.leetcode;

import java.util.Arrays;

/**
 * Created by IK on 2017-06-20.
 */
public class MergeSort {
    int[] temp = null;
    int k = 0;

    public int[] mergeSort(int[] arr) {
        temp = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        mergeSort(left, right, arr);
        return temp;
    }

    private void mergeSort(int left, int right, int[] arr) {
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort(left, mid, arr);
            mergeSort(mid + 1, right, arr);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int sRight = mid + 1;
        k = left;
        int tempLeft = left;
        while (tempLeft <= mid && sRight <= right) {
            if (arr[tempLeft] <= arr[sRight]) {
                temp[k] = arr[tempLeft];
                tempLeft++;
                k++;
            } else {
                temp[k] = arr[sRight];
                sRight++;
                k++;
            }
        }

        if (tempLeft > mid) {
            for (int i = sRight; i <= right; i++) {
                temp[k] = arr[i];
                k++;
            }
        } else {
            for (int i = tempLeft; i <= mid; i++) {
                temp[k] = arr[i];
                k++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}