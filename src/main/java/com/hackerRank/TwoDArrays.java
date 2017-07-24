package com.hackerRank;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                int sum = 0;
                for (int k = -1; k < 2; k++) {
                    for (int h = -1; h < 2; h++) {
                        if (k == 0 && h != 0) {
                            continue;
                        }
                        sum += arr[i + k][j + h];
                    }
                }
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        System.out.println(max);
    }
}