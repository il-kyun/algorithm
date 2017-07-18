package com.codility;

import java.util.Arrays;

/**
 * Created by IK on 2017-07-18.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int length = A.length;
        if (length == 0) {
            return A;
        }
        int[] result = new int[length];
        int rIdx = 0;
        int times = K % length;
        int idx = length - times;
        for (int i = idx; i < length; i++) {
            result[rIdx] = A[i];
            rIdx++;
        }
        for (int i = 0; i < idx; i++) {
            result[rIdx] = A[i];
            rIdx++;
        }
        return result;
    }
}