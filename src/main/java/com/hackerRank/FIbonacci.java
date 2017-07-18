package com.hackerRank;

import java.util.Scanner;

/**
 * Created by IK on 2017-07-14.
 */
public class FIbonacci {

    public static int fibonacci(int n) {
        // Complete the function.
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);

    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.close();
        System.out.println(fibonacci(5));
    }
}
