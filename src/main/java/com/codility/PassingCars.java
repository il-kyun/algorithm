package com.codility;

import java.util.ArrayList;
import java.util.List;

public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> eastList = new ArrayList<>();

        int passedWest = 0;
        for (int a : A) {
            if (a == 0) {
                eastList.add(passedWest);
            } else {
                passedWest++;
            }
        }

        int result = 0;
        for (int e : eastList) {
            result += passedWest - e;
            if (result > 1000000000) {
                return -1;
            }
        }

        return result;

    }

    public int solution1(int[] A) {
        // write your code in Java SE 8
        int pairCount = 0;
        int eastCount = 0;
        for (int a : A) {
            if (a == 1) {
                pairCount += eastCount;
            } else {
                eastCount++;
            }

            if (pairCount > 1e9) {
                return -1;
            }
        }
        return pairCount;
    }
}
