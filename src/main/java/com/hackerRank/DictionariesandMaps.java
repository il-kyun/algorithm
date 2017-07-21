package com.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesandMaps {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer integer = map.get(s);
            if( integer == null){
                System.out.println("Not found");
            }else {
                System.out.println(s+"="+integer);
            }
        }
        in.close();
    }
}
