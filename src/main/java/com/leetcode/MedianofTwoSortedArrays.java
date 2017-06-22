package com.leetcode;

/**
 * Created by IK on 2017-06-20.
 */

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        int mid = (nums1.length + nums2.length) / 2;

        while (i <= mid) {
            if (j < nums1.length && k < nums2.length) {
                merged[i++] = nums1[j] < nums2[k] ? nums1[j++] : nums2[k++];
            } else if (j < nums1.length) {
                merged[i++] = nums1[j++];
            } else if (k < nums2.length) {
                merged[i++] = nums2[k++];
            }
        }

        if (merged.length % 2 == 1) {
            return (double)merged[mid];
        } else {
            return (double) (merged[mid] + merged[mid - 1]) / 2;
        }
    }
}
