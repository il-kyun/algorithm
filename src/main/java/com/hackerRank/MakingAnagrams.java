package com.hackerRank;

import java.util.Scanner;

/**
 * Created by IK on 2017-07-14.
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] arr =  new int[26];
        char[] chars = first.toCharArray();
        char[] chars2 = second.toCharArray();
        for(char c:  chars){
            int index = c - 'a';
            arr[index]++;
        }

        for(char c:  chars2){
            int index = c - 'a';
            arr[index]--;
        }

        int sum = 0;
        for(int i : arr){
            sum += Math.abs(i);
        }

        return sum;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
