package com.codility;


/**
 * Created by IK on 2017-07-12.
 */
public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int[] arr = new int[32];

        int l = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] * 2;
            }
            if (arr[i] * 2 > N || arr[i] * 2 < 1) {
                l = i;
                break;
            }
        }
        int result = 0;
        int c = 0;
        int m = N;
        for (int k = l; k > -1; k--) {
            if (m >= arr[k]) {
                result = result > c ? result : c;
                if (k < result) {
                    break;
                }
                c = 0;
                m = m - arr[k];
            } else {
                c++;
            }
        }
        return result;
    }

    public int solution1(int N) {
        String s = Integer.toBinaryString(N);
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result = Math.max(result, count);
                count = 0;
            } else {
                count++;
            }
        }
        return result;
    }

}
