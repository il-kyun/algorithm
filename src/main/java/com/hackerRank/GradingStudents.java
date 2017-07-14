package com.hackerRank;

import java.util.Scanner;

/**
 * Created by IK on 2017-07-13.
 */
public class GradingStudents {
    static int[] solve(int[] grades){
        // Complete this function
        int size = grades.length;
        int[] results = new int[size];
        for( int i =0; i < size; i++){
            int rounded = 0;
            if( grades[i] % 5 > 2 && grades[i] / 5 > 6){
                rounded = grades[i] +  (5- grades[i] % 5);
            } else {
                rounded= grades[i];
            }

            results[i] = rounded;
        }
        return results;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
