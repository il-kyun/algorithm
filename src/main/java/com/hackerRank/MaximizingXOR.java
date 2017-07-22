package com.hackerRank;

import java.util.Scanner;

public class MaximizingXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = l; i < r + 1; i++) {
            for (int j = l; j < r + 1; j++) {
                max = Math.max(max, i ^ j);
            }
        }
        System.out.println(max);
    }
}