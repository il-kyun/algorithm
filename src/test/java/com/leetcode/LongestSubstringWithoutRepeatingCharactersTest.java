package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IK o  n 2017-06-19.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test1() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int result = l.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test2() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int result = l.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(result, 1);
    }

    @Test
    public void test3() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int result = l.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(result, 3);
    }

    @Test
    public void test4() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int result = l.lengthOfLongestSubstring("c");
        Assert.assertEquals(result, 1);
    }
}