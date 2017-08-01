package com.codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = Integer.MIN_VALUE;
        Set set = new HashSet();
        for (int a : A) {
            max = Math.max(max, a);
            set.add(a);
        }
        return A.length == max && A.length == set.size() ? 1 : 0;
    }
}
