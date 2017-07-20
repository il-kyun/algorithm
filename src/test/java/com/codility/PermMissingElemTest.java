package com.codility;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class PermMissingElemTest {
    @Test
    public void test1(){
        int[] arr = {3,2,5,1};
        PermMissingElem e = new PermMissingElem();
        int result = e.solution(arr);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2(){
        int[] arr = {3,2,5,4};
        PermMissingElem e = new PermMissingElem();
        int result = e.solution(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test3(){
        int[] arr = {1};
        PermMissingElem e = new PermMissingElem();
        int result = e.solution(arr);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test4(){
        int[] arr = {2};
        PermMissingElem e = new PermMissingElem();
        int result = e.solution(arr);
        Assert.assertEquals(1, result);
    }

}
