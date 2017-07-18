package com.codility;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by IK on 2017-07-18.
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map.entrySet().stream().filter(e -> e.getValue() % 2 == 1).map(e -> e.getKey()).findFirst().get();
    }

    public int solution1(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.stream().findFirst().get();
    }

    public int solution2(int[] A) {
        // write your code in Java SE 8
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;
        }
        return unpaired;
    }
}
