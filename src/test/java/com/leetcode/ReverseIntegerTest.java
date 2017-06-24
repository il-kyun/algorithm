package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-06-23.
 */
public class ReverseIntegerTest {

    @Test
    public void test1() {
        int num = 123;
        ReverseInteger f = new ReverseInteger();
        int result = f.reverse(num);
        Assert.assertEquals(321, result, 0);
    }

    @Test
    public void test2() {
        int num = -123;
        ReverseInteger f = new ReverseInteger();
        int result = f.reverse(num);
        Assert.assertEquals(-321, result, 0);
    }

    @Test
    public void test3() {
        int num = 10100;
            ReverseInteger f = new ReverseInteger();
            int result = f.reverse(num);
            Assert.assertEquals(101, result, 0);
        }

        @Test
        public void test4() {
            int num = 0;
            ReverseInteger f = new ReverseInteger();
        int result = f.reverse(num);
        Assert.assertEquals(0, result, 0);
    }

    @Test
    public void test5() {
        int num = 1000000003;
        ReverseInteger f = new ReverseInteger();
        int result = f.reverse(num);
        Assert.assertEquals(0, result, 0);
    }
}
