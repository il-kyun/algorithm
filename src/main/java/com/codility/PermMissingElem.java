package com.codility;

public class PermMissingElem {

    public int solution(int[] A) {
        long n = A.length + 1;
        long expected = (n + 1) * n / 2;
        for (int i = 0; i < A.length; i++) {
            expected -= A[i];
        }
        return (int) expected;
    }
}
