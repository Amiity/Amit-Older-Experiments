package com.copra.Eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {


        // Without terminal operation it will not intermediate operation does't perform
        Stream.of(2, 3, 4, 5).filter(num -> {
            System.out.println(" num : " + num);
            return num % 2 == 0;
        });

        List<String> allPairs = new ArrayList<>();
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream()
                .map(s -> s + "-" + s)         //"a-a", "b-b", "c-c"
                .peek(allPairs::add)
                .filter(s -> !s.equals("b-b"))         //"a-a", "c-c"
                .forEach(s -> System.out.println(s));

    }

}
