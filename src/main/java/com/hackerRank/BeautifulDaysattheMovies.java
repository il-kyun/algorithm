package com.hackerRank;

/**
 * Created by IK on 2017-07-17.
 */
public class BeautifulDaysattheMovies {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        int result = 0;
        while (i <= j) {
            int t1 = 0;
            int t2 = i;

            while (t2 > 0) {
                t1 = (t1 * 10) + (t2 % 10);
                t2 = t2 / 10;
            }

            System.out.println(t1);

            int o1 = (i - t1) / k;
            if (i - t1 == k * o1) {
                result++;
            }
            i++;

        }


        System.out.println(result);
    }
}
