package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-06-27.
 */
public class ZigZagConversionTest {
    @Test
    public void test() {
        String s1 = "PAYPALISHIRING";
        int row = 3;
        ZigZagConversion z = new ZigZagConversion();
        String convert = z.convert(s1, row);
        Assert.assertEquals("PAHNAPLSIIGYIR", convert);
    }

    @Test
    public void test1() {
        String s1 = "A";
        int row = 3;
        ZigZagConversion z = new ZigZagConversion();
        String convert = z.convert(s1, row);
        Assert.assertEquals("A", convert);
    }

    @Test
    public void test2() {
        String s1 = "AB";
        int row = 3;
        ZigZagConversion z = new ZigZagConversion();
        String convert = z.convert(s1, row);
        Assert.assertEquals("A", convert);
    }

    @Test
    public void test23() {
        String s1 = "ABC";
        int row = 2;
        ZigZagConversion z = new ZigZagConversion();
        String convert = z.convert(s1, row);
        Assert.assertEquals("ACB", convert);
    }
}
