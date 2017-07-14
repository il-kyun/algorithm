package com.codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-07-12.
 */
public class BinaryGapTest {

    @Test
    public void test() {
        BinaryGap bg = new BinaryGap();

        int result = bg.solution(5);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void test1() {
        BinaryGap bg = new BinaryGap();

        int result = bg.solution(1041);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void test2() {
        BinaryGap bg = new BinaryGap();

        int result = bg.solution1(1041);
        Assert.assertEquals(result, 5);
    }
}
