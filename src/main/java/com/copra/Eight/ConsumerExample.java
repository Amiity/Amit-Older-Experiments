package com.copra.Eight;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<Students> consume = new Consumer<Students>() {
            @Override
            public void accept(Students students) {
                students.setAge(25);
                System.out.println(students.getAge()+ " :  "+students.getName());
            }
        };

        consume.accept(  new Students(3, "Amit", 24, 3, "BBD"));

        //lambda expression
        Students s1 =   new Students(2, "Alok", 26, 2, "PSIT");
        Consumer<Students>  consume2 = (students) -> { System.out.println(students); };
        consume2.accept(s1);


        //consumer chain
        Consumer<Students> consumeUpper = (students) -> { System.out.println(students.getName().toUpperCase());};
        Consumer<Students> consumerAppend = (students -> { System.out.println(students.getName().concat(" Kumar"));});

        Consumer<Students> result = consumeUpper.andThen(consumerAppend);
        result.accept(s1);


    }
}
