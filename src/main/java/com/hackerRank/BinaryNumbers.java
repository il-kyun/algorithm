package com.hackerRank;

import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String s = Integer.toBinaryString(number);

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                if (max > s.length() - i + 1) {
                    break;
                }
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }


}
