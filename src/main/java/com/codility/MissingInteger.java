package com.codility;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int notSequentialMin = 1;
        for (int i : A) {
            if (i < 1) {
                continue;
            }
            int diff = i - notSequentialMin;
            if (diff == 0) {
                notSequentialMin++;
            }
        }
        return notSequentialMin;
    }
}
