package com.leetcode;

import org.junit.Test;

/**
 * Created by IK on 2017-06-25.
 */
public class PalindromeNumberTest {
    @Test
    public void test1() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int val = 1221;
        System.out.println(palindromeNumber.isPalindrome(val));
    }

    @Test
    public void test2() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int val = 11311;
        System.out.println(palindromeNumber.isPalindrome(val));
    }

    @Test
    public void test3() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int val = 112321;
        System.out.println(palindromeNumber.isPalindrome(val));
    }
}
