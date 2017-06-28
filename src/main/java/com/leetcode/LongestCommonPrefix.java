package com.leetcode;

/**
 * Created by IK on 2017-06-28.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int size = strs.length;
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        boolean flag = true;
        while (flag) {
            char ex = 0;
            for (int i = 0; i < size; i++) {
                if (strs[i].length() <= pos) {
                    flag = false;
                } else if (i == 0) {
                    ex = strs[i].charAt(pos);
                } else {
                    if (ex != strs[i].charAt(pos)) {
                        flag = false;

                    }
                }
            }
            pos++;
        }
        return strs[0].substring(0, pos - 1);
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
