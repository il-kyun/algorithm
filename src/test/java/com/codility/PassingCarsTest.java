package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {
    @Test
    public void test(){
        PassingCars p = new PassingCars();
        int[] arr = new int[]{0,1,0,1,1};
        int solution = p.solution1(arr);
        Assert.assertEquals(5, solution);
    }
}
