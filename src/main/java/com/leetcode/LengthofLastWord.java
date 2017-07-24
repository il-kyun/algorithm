package com.leetcode;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");

        return arr[arr.length - 1].length();
    }
}