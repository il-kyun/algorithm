package com.leetcode;

import org.junit.Test;

/**
 * Created by IK on 2017-06-25.
 */
public class RegularExpressionMatchingTest {
    /**
     * Some examples:
     isMatch("aa","a") → false
     isMatch("aa","aa") → true
     isMatch("aaa","aa") → false
     isMatch("aa", "a*") → true
     isMatch("aa", ".*") → true
     isMatch("ab", ".*") → true
     isMatch("aab", "c*a*b") → true
     */

    @Test
    public void test1(){
        RegularExpressionMatching matching = new RegularExpressionMatching();
        matching.isMatch("aa", "a");
    }
}
