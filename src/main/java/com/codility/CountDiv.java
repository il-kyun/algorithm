package com.codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int count = 0;
        if (A == B) {
            return A % K == 0 ? 1 : 0;
        }
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        return count;
    }

    public int solution1(int A, int B, int K) {
        // write your code in Java SE 8
        int a = A / K;
        if (A % K == 0) {
            a--;
        }
        int b = B / K;

        return b - a;
    }
}