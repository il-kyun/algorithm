package com.leetcode;

/**
 * Created by IK on 2017-06-20.
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0d;
        int size = Math.max(nums1.length, nums2.length);
        for(int i = 0; i < size ; i++){
            int temp = 0 ;
            int g = 0;
            if( i < nums1.length){
                    temp += nums1[i];
                    g++;
            }
            if( i < nums2.length){
                temp += nums2[i];
                g++;
            }
            median += temp/g/2;
            temp = 0;
            g = 0;

        }
        return median;

    }
}
