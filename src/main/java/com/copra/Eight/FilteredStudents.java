package com.copra.Eight;

public class FilteredStudents implements StudentsFiltering{
    @Override
    public boolean test(Students students) {
        return students.getAge()>25;
    }
}
