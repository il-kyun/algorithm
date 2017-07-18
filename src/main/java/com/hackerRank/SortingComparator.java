package com.hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by IK on 2017-07-14.
 */
public class SortingComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if( o1.score> o2.score){
            return -1;
        } else if( o1.score< o2.score) {
            return 1;
        }else {
            char[] chars1 = o1.name.toCharArray();
            char[] chars2 = o2.name.toCharArray();
            int size = chars1.length < chars2.length ? chars1.length : chars2.length;
            for( int i=0; i< size ; i ++){

                if(chars1[i] == chars2[i]){
                    continue;
                }
                return chars1[i] > chars2[i]? 1: -1;
            }
            if( chars2.length > size){
                return 1;
            }
            if( chars1.length > size){
                return -1;
            }
        }
        return 0;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
