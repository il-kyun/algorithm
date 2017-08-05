package com.codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[N];
        int max = 0;
        for (int a : A) {
            if (a == N + 1) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = max;
                }
            } else {
                max = Math.max(max, arr[a - 1] + 1);
                arr[a - 1] = arr[a - 1] + 1;

            }
        }
        return arr;
    }

    public int[] solution1(int N, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[N];
        int max = 0;

        int maxCount = 0;
        int tempMax = 0;
        int[] temp = new int[N];

        for (int a : A) {
            if (a == N + 1) {
                tempMax = max;
                maxCount++;
            } else {
                if (temp[a - 1] < maxCount) {
                    arr[a - 1] = tempMax + 1;
                    max = Math.max(max, tempMax + 1);
                    temp[a - 1] = maxCount;
                } else {
                    max = Math.max(max, arr[a - 1] + 1);
                    arr[a - 1] = arr[a - 1] + 1;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < maxCount) {
                arr[i] = tempMax;
            }
        }

        return arr;
    }
}
