package com.codility;

import java.util.*;

public class MaxProductOfThree {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int max1 = A[0] * A[1] * A[A.length - 1];
        int max2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return max1>max2 ? max1:max2;
    }
}
