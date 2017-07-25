package com.codility;

import org.junit.Assert;
import org.junit.Test;


public class MissingIntegerTest {
    @Test
    public void test() {
        int[] arr = {1, 3, 2, 1, 5, 6, 7, 9, 11};
        MissingInteger m = new MissingInteger();
        int solution = m.solution(arr);
        Assert.assertEquals(4, solution);
    }

    @Test
    public void test1() {
        int[] arr = {21247172, 1, 3, 2, 1, 5, 6, 7, 9, 11};
        MissingInteger m = new MissingInteger();
        int solution = m.solution(arr);
        Assert.assertEquals(4, solution);
    }

    @Test
    public void test2() {
        int[] arr = {1, 3, 3332, 1, 5, 44446, 7, 9, 11};
        MissingInteger m = new MissingInteger();
        int solution = m.solution(arr);
        Assert.assertEquals(2, solution);
    }


    @Test
    public void test3() {
        int[] arr = {1, 3, 2, 44441, 5, 6, 7, 9, -44433411};
        MissingInteger m = new MissingInteger();
        int solution = m.solution(arr);
        Assert.assertEquals(4, solution);
    }

    @Test
    public void test4() {
        int[] arr = {1};
        MissingInteger m = new MissingInteger();
        int solution = m.solution(arr);
        Assert.assertEquals(2, solution);
    }
}
