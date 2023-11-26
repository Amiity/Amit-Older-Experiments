package com.copra.codingpractice;


import java.util.HashMap;
import java.util.Map;

public class HighestAndLowest {

    public static void main(String[] args) {
        int arr[] = {13, 6, 13, 18, 7, 17, 1, 17, 2, 5, 2, 18, 19, 11};
        int b[] = getFrequencies(arr);
        for (int a : b) {
            System.out.println(a);
        }

    }

    public static int[] getFrequencies(int[] v) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int val : v) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        int maxFrequency = 0;
        int minFrequency = v.length;
        int maxElement = 0;
        int minElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxFrequency < entry.getValue()) {
                maxFrequency = entry.getValue();
                maxElement = entry.getKey();
            }
            if (minFrequency > entry.getValue()) {
                minFrequency = entry.getValue();
                minElement = entry.getKey();
            }
            /*if (minFrequency == entry.getValue()) {
                if (minElement > entry.getKey()) {
                    minElement = entry.getKey();
                }
            }*/
        }

        int[] a = new int[2];
        a[0] = maxElement;
        a[1] = minElement;

        return a;

    }
}
