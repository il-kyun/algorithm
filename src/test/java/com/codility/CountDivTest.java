package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class CountDivTest {
    @Test
    public void test() {
        CountDiv c = new CountDiv();
        long s = System.currentTimeMillis();
        int solution = c.solution(6, 11, 2);
        long e = System.currentTimeMillis();
        Assert.assertEquals(3, solution);
        System.out.println("running time(millis) : " + (e - s));
    }

    @Test
    public void test1() {
        CountDiv c = new CountDiv();
        long s = System.currentTimeMillis();
        int solution = c.solution(1, Integer.MAX_VALUE, 1);
        long e = System.currentTimeMillis();
        System.out.println("running time(millis) : " + (e - s));
    }

    @Test
    public void test2() {
        CountDiv c = new CountDiv();
        long s = System.currentTimeMillis();
        int solution = c.solution1(6, 11, 2);
        long e = System.currentTimeMillis();
        Assert.assertEquals(3, solution);
        System.out.println("running time(millis) : " + (e - s));
    }
    @Test
    public void test3() {
        CountDiv c = new CountDiv();
        long s = System.currentTimeMillis();
        int solution = c.solution1(1, Integer.MAX_VALUE, 1);
        long e = System.currentTimeMillis();
        System.out.println("running time(millis) : " + (e - s));
    }
}
