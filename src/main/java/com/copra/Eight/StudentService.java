package com.copra.Eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
    List<Students> students;

    public StudentService() {
        students=    List.of(
                new Students(4, "Anoop", 25, 1, "PSIT"),
                new Students(3, "Amit", 24, 3, "BBD"),
                new Students(6, "Devendra", 26, 2, "GGK"),
                new Students(2, "Alok", 26, 2, "PSIT"),
                new Students(1, "Bilal", 28, 3, "AXIS"),
                new Students(7, "Prashant", 22, 5, "IITK"),
                new Students(8, "Osho", 25, 8, "IITB"),
                new Students(5, "Salil", 24, 2, "IT-BHU")
        );
    }

    public List<Students> byAge(StudentsFiltering studentsFiltering) {
        List<Students> students1 = new ArrayList<>();
        for (Students student : students)
            if (studentsFiltering.test(student))
                students1.add(student);

        return students1;

    }

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        List<Students> std = studentService.byAge(new FilteredStudents());
        //System.out.println(std);
        int age = 25;
        List<Students> std2 = studentService.byAge(new StudentsFiltering() {
            @Override
            public boolean test(Students students)
            {
                return students.getAge()>age;
            }
        });
        //System.out.println(std2);

        List<Students> std3 = studentService.byAge((Students stu) -> stu.getAge()>26);
        //System.out.println(std3);

        List<Students> std4 = studentService.byAge((stude) -> stude.getAge()>26);
        System.out.println(std4);

    }

}
