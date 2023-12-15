package com.copra.Eight;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsumerExample2 {

    public static void main(String[] args) {

        List<Integer> lst = List.of(4, 1, 5, 5, 2, 1);

        Consumer<Integer> consumer = num -> System.out.println(num);
        consumer.accept(5);
        lst.forEach(consumer);

        List<String> stringList = List.of("Hey", "Hello", "Hi");

        Consumer<String> str = s -> System.out.println(s.concat("Amy"));

        stringList.forEach(str.andThen(s -> System.out.println(s.toUpperCase())));

        System.out.println("    //////    ");
        Function<String, String> func = s -> {
            String modified = s.concat(" Amit");
            System.out.println(modified);
            return modified;
        };
        Function<String, String> func2 = s -> {
            String modified = s.toUpperCase();
            System.out.println(modified);
            return modified;
        };

        List<String> modifiedList = stringList.stream()
                .map(func.andThen(func2))
                .collect(Collectors.toList());


    }

}
