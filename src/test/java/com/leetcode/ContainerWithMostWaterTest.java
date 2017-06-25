package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-06-25.
 */
public class ContainerWithMostWaterTest {
    @Test
    public void test() {

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[]{1, 2, 3, 4, 5, 6};
        int i = containerWithMostWater.maxArea(height);
        Assert.assertEquals(i , 9);

    }
}
