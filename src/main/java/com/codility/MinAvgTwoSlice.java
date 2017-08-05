package com.codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double minAvg = 10000;
        int minIdx = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + A[i + 1]) / 2.0d < minAvg) {
                minAvg = (A[i] + A[i + 1]) / 2.0d;
                minIdx = i;

            }

            if (i < A.length - 2 && (A[i] + A[i + 1] + A[i + 2]) / 3.0d < minAvg) {
                minAvg = (A[i] + A[i + 1] + A[i + 2]) / 3.0d;
                minIdx = i;
            }
        }
        return minIdx;
    }
}
