package com.copra.Eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> p = new A();
        boolean output = p.test("Ami");
        System.out.println(output);


        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "Amit".equals(s);
            }
        };

        boolean output1 = p1.test("Amit");
        System.out.println(output1);


        Predicate<String> p2 = (s) -> ( "Amit".equals(s));
        boolean output2 = p2.test("AMIT");
        System.out.println(output2);


        Predicate<String> p3 = "Amit"::equals;
        boolean output3 = p3.test("Amit");
        System.out.println(output3);



        // Example with students class ....

        List<Students> studentList = List.of(
                new Students(4, "Anoop", 25, 1, "PSIT"),
                new Students(3, "Amit", 24, 3, "BBD"),
                new Students(6, "Devendra", 26, 2, "GGK"),
                new Students(2, "Alok", 26, 2, "PSIT"),
                new Students(1, "Bilal", 28, 3, "AXIS"),
                new Students(7, "Prashant", 22, 5, "IITK"),
                new Students(8, "Osho", 25, 8, "IITB"),
                new Students(5, "Salil", 24, 2, "IT-BHU")
        );


       // filter example which takes predicate as input...

       // Can you provide an example of using a Predicate to filter a list of Students based on their age?
        System.out.println("Can you provide an example of using a Predicate to filter a list of Students based on their age?");
       studentList.stream().filter((students) -> students.getAge()>25  &&  students.getRank()<4).forEach((student) -> System.out.println(student));

       System.out.println("");
       //student name is greater than 4
        System.out.println("student name is greater than 4");
       List<Students> students1 = studentList.stream().filter((students) -> students.getName().length()>4).collect(Collectors.toList());
       students1.forEach(System.out::println);

    }
}

class A implements  Predicate<String>{

    @Override
    public boolean test(String s) {
        String s1 = s.toUpperCase();
        return "Amit".equals(s1);
    }
}
