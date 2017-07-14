package com.leetcode;

/**
 * Created by IK on 2017-06-25.
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != p.charAt(i)) {
                if (p.indexOf("*") > -1) {

                } else if (p.indexOf(".") > -1) {
                    continue;
                } else {
                    return false;
                }
            }


        }
        return result;

    }
}
