package com.hackerRank;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            String next = scanner.next();
            System.out.println(run(next));
        }
    }

    private static String run(String str) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                first.append(str.charAt(i));
            } else {
                second.append(str.charAt(i));
            }
        }
        return first.toString() + " " + second.toString();
    }
}
