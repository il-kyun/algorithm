package com.leetcode;

/**
 * Created by IK on 2017-06-23.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;

            if (newResult / 10 != result) {
                return 0;
            }

            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
