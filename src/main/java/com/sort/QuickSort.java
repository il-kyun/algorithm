package com.sort;

/**
 * Created by IK on 2017-06-25.
 */
public class QuickSort {

    public int[] sort( int[] arr){
        int low = 0;
        int high = arr.length - 1;
        return quicksort(arr, low, high);

    }

    public int[] quicksort( int[] arr, int low, int high){
        if( arr == null || arr.length ==0){
            return arr;
        }

        if( low >= high){
            return arr;
        }

        int mid = low + (high - low)/2;
        int pivot = arr[mid];

        int i = low;
        int j = high;

        while(i <= j){
            while(arr[i]< pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if( i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if( low < j){
            quicksort(arr, low, j);
        }

        if( i < high){
            quicksort(arr, i, high);
        }

        return arr;
    }

    private void swap(int[] arr, int src, int trg) {
        int temp = arr[src];
        arr[src] = arr[trg];
        arr[trg] = temp;
    }
}
