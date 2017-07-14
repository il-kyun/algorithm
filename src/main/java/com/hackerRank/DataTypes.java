package com.hackerRank;

import java.util.Scanner;

/**
 * Created by IK on 2017-07-14.
 */
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
         /* Declare second integer, double, and String variables. */
        int f = 0;
        double db = 0d;
        String str = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        f = scan.nextInt();
        db = scan.nextDouble();
        while (scan.hasNext()) {
            str += scan.next() + " ";
        }
        str = str.trim();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + f);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + db);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + str);

    }
}
