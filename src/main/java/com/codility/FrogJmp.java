package com.codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        long x = (long) X;
        long y = (long) Y;

        int result = (int) (y - x) / D;
        int remain = (int) (y - x) % D;
        if (remain == 0) {
            return result;
        } else {
            return result + 1;
        }
    }
}