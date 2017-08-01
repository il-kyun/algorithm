package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {
    @Test
    public void test(){
        PermCheck a = new PermCheck();
        int[] arr = new int[]{3,2,1,4};
        int solution = a.solution(arr);
        Assert.assertEquals(1, solution);
    }

    @Test
    public void test1(){
        PermCheck a = new PermCheck();
        int[] arr = new int[]{3,1,4};
        int solution = a.solution(arr);
        Assert.assertEquals(0, solution);
    }

    @Test
    public void test2(){
        PermCheck a = new PermCheck();
        int[] arr = new int[]{3,1,2,4,5,7,3};
        int solution = a.solution(arr);
        Assert.assertEquals(0, solution);
    }
}
