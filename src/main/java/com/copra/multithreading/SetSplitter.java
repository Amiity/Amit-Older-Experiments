package com.copra.multithreading;

import java.util.*;

public class SetSplitter {
    public static <T> List<Set<T>> split(Set<T> original, int count) {
        List<Set<T>> result = new ArrayList<>(count);
        Iterator<T> it = original.iterator();
        double each = Math.ceil((double) original.size() / (double) count);

        for (int i = 0; i < count; i++) {
            HashSet<T> s = new HashSet<>();
            result.add(s);

            for (int j = 0; j < (int) each && it.hasNext(); j++) {
                s.add(it.next());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 7642; i++) {
            integers.add(i);
        }
        Set<Integer> originalSet = new HashSet<>(integers);
        int splitCount = 192;
        List<Set<Integer>> result = split(originalSet, splitCount);
        System.out.println(result.size());
        /*for (int i = 0; i < result.size(); i++) {
            System.out.println("Set " + (i + 1) + ": " + result.get(i));
        }*/
    }
}
