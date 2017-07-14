package com.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IK on 2017-06-25.
 */
public class FourSumTest {
    @Test
    public void test(){
        FourSum sum= new FourSum();
        int[] arr = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> lists = sum.fourSum(arr, target);
        System.out.println(Arrays.asList(lists));
    }

    @Test
    public void test1(){
        FourSum sum= new FourSum();
        int[] arr = new int[]{-3,-2,-1,0,0,1,2,3};
        int target = 0;
        List<List<Integer>> lists = sum.fourSum(arr, target);
        System.out.println(Arrays.asList(lists));
    }
}
