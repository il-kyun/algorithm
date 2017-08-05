package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {
//    A[0] = 1
//    A[1] = 3
//    A[2] = 1
//    A[3] = 4
//    A[4] = 2
//    A[5] = 3
//    A[6] = 5
//    A[7] = 4
    @Test
    public void test() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int x = 5;
        int[] arr = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        int solution = frogRiverOne.solution(x, arr);
        Assert.assertEquals(6, solution);
    }

    @Test
    public void test1() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int x = 1;
        int[] arr = new int[]{1};
        int solution = frogRiverOne.solution(x, arr);
        Assert.assertEquals(1, solution);
    }
}
