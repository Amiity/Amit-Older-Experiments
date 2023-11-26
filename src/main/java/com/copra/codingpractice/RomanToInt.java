package com.copra.codingpractice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (i < s.length() - 1 && map.get(ch) < map.get(s.charAt(i + 1))) {
                num = num - map.get(ch);
            } else {
                num += map.get(ch);
            }

        }
        return num;

    }

}
