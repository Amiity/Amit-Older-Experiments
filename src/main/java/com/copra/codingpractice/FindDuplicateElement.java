package com.copra.codingpractice;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElement {

    public static void main(String[] args) {


        List<Integer> list = List.of(2, 5, 3, 2, 6, 7, 4, 3, 3, 5, 9);
        Set<Integer> set = new HashSet<>();
        Set<Integer> filterdList = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());

        filterdList.forEach(System.out::println);


        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k+ " "+ v));
    }
}
