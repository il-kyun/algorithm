package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class MaxCountersTest {
    @Test
    public void test(){
        MaxCounters m = new MaxCounters();
        int N = 5;
        int[] arr = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] solution = m.solution(N, arr);
        int[] expected = new int[]{3, 2, 2, 4, 2};
        Assert.assertArrayEquals(solution,expected );
    }

    @Test
    public void test11(){
        MaxCounters m = new MaxCounters();
        int N = 5;
        int[] arr = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] solution = m.solution1(N, arr);
        int[] expected = new int[]{3, 2, 2, 4, 2};
        Assert.assertArrayEquals(solution,expected );
    }
}
