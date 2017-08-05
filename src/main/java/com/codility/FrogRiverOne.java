package com.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);
            }
            if (set.size() == X) {
                return i;
            }
        }

        return -1;

    }

}
