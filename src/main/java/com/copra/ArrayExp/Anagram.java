package com.copra.ArrayExp;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nmagara";
        Anagram a = new Anagram();
        boolean val = a.isAnagram(s, t);
        System.out.println(val);
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (Character val : s.toCharArray()) {
            if (map.containsKey(val)) {
                int count = map.get(val);
                map.put(val, count + 1);
                System.out.println("val : "+val+" count : "+map.get(val));
            }else {
                map.put(val, 1);
                System.out.println("eval : " + val + " count : " + map.get(val));
            }
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (Character val : t.toCharArray()) {
            if (map2.containsKey(val)) {
                int count = map2.get(val);
                map2.put(val, count + 1);
                System.out.println("val : "+val+" count : "+map2.get(val));
            }else {
                map2.put(val, 1);
                System.out.println("eval : " + val + " count : " + map2.get(val));
            }
        }
        return true;
    }
}

