package com.leetcode;

/**
 * Created by IK on 2017-06-27.
 */
public class ZigZagConversion {
    public String convert1(String s, int numRows) {
        //convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
        if (s.length() == 1 || s.length() < numRows) {
            return s;
        }
        char[] chars = s.toCharArray();
        char[][] arr = new char[numRows][chars.length / numRows * 2];
        int j = 0;
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (j < numRows) {
                arr[j][k] = chars[i];
                j++;
            } else if (j == numRows) {
                j = numRows % 2 == 1 ? numRows / 2 : numRows / 2 - 1;
                k++;
                arr[j][k] = chars[i];
                j = 0;
                k++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char[] arr1 : arr) {
            for (char c : arr1) {
                if (c != 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");   //init every sb element **important step!!!!
        }
        int incre = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            sb[index].append(s.charAt(i));
            if (index == 0) {
                incre = 1;
            }
            if (index == numRows - 1) {
                incre = -1;
            }
            index += incre;
        }
        String re = "";
        for (int i = 0; i < sb.length; i++) {
            re += sb[i];
        }
        return re.toString();
    }
}