package com.hackerRank;

        import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        // Complete this function
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(--n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}