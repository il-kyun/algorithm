package com.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by IK on 2017-07-14.
 */
public class Contacts {

    public static void main(String[] args) {
        Trie trie = new Trie();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if("add".equals(op)){
                trie.add(contact);
            } else  if ("find".equals(op)){
                System.out.println(trie.count(contact));

            }
        }
    }


}
class Trie {
    Map<Character, Trie> letter2trie = new HashMap<Character, Trie>();
    int count;

    void add(String s) {
        count++;

        if (!s.isEmpty()) {
            char first = s.charAt(0);
            if (!letter2trie.containsKey(first)) {
                letter2trie.put(first, new Trie());
            }

            letter2trie.get(first).add(s.substring(1));
        }
    }

    int count(String s) {
        if (s.isEmpty()) {
            return count;
        }

        char first = s.charAt(0);
        return letter2trie.containsKey(first) ? letter2trie.get(first).count(s.substring(1)) : 0;
    }
}