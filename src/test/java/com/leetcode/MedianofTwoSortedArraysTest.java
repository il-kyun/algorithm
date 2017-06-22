package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-06-20.
 */
public class MedianofTwoSortedArraysTest {

    @Test
    public void test1(){
        int[] arr1 = new int[]{1,3};
        int[] arr2 = new int[]{2};
        MedianofTwoSortedArrays m= new MedianofTwoSortedArrays();
        double result = m.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void test2(){
        int[] arr1 = new int[]{1,2};
        int[] arr2 = new int[]{3,4};
        MedianofTwoSortedArrays m= new MedianofTwoSortedArrays();
        double result = m.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(2.5, result, 0);
    }

    @Test
    public void test3(){
        int[] arr1 = new int[]{1,5,7};
        int[] arr2 = new int[]{2,4,10};
        MedianofTwoSortedArrays m= new MedianofTwoSortedArrays();
        double result = m.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(4.5, result, 0);
    }
}
