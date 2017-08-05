package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {
    @Test
    public void test(){
        MaxProductOfThree m = new MaxProductOfThree();
        int[] arr= new int[]{-3, 1, 2, -2, 5, 6};
        int solution = m.solution(arr);
        Assert.assertEquals(60, solution);
    }



}
