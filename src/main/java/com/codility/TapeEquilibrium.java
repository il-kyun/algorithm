package com.codility;


public class TapeEquilibrium {
    public int solution(int[] A) {
        int size = A.length;

        int leftSum = 0;

        if (size == 2) {
            return Math.abs(A[1] - A[0]);
        }

        int total = 0;
        for (int i : A) {
            total += i;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size - 1; i++) {
            leftSum += A[i];
            int rightSum = total - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            min = Math.min(min, diff);

        }
        return min;
    }
}