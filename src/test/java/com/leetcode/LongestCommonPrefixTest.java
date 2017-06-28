package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK on 2017-06-28.
 */
public class LongestCommonPrefixTest {
    @Test
    public void test() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = new String[]{"abc", "abcd", "abdinv","abqidjf"};
        String s = longestCommonPrefix.longestCommonPrefix(arr);
        Assert.assertEquals("ab", s);
    }

    @Test
    public void test1() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = new String[]{};
        String s = longestCommonPrefix.longestCommonPrefix(arr);
        Assert.assertEquals("", s);
    }
}
