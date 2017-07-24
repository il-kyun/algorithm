package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {
    @Test
    public void test() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3});
        Assert.assertEquals(1, result);
    }

    @Test
    public void test1() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{3, 1});
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{3, 1, 1, 3});
        Assert.assertEquals(0, result);
    }

    @Test
    public void test3() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{3, 1, 2, 1, 3});
        Assert.assertEquals(2, result);
    }

    @Test
    public void test4() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{4, 1, 2, -2, 3});
        Assert.assertEquals(0, result);
    }

    @Test
    public void test5() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{2, 70});
        Assert.assertEquals(68, result);
    }

    @Test
    public void test6() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(new int[]{-2, 70});
        Assert.assertEquals(72, result);
    }
}
