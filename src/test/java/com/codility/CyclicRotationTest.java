package com.codility;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IK on 2017-07-18.
 */
public class CyclicRotationTest {

    @Test
    public void test1() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] arr = {3, 8, 9, 7, 6};
        int r = 3;
        int[] result = cyclicRotation.solution(arr, r);
        int[] expect = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test2() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] arr = {3, 8, 9, 7, 6};
        int r = 13;
        int[] result = cyclicRotation.solution(arr, r);
        int[] expect = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test3() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] arr = {3, 8, 9, 7, 6};
        int r = 1;
        int[] result = cyclicRotation.solution(arr, r);
        int[] expect = {6, 3, 8, 9, 7};
        Assert.assertArrayEquals(expect, result);
    }
}
