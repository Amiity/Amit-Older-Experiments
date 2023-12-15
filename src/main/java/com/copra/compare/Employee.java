package com.copra.compare;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return this.age - o.age;
    }
}


class Runner{

    public Runner() {
    }

    public static void main(String [] args){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(4,"Naveen", 26));
        employeeList.add(new Employee(4,"Alok", 28));
        employeeList.add(new Employee(4,"Amit", 24));
        employeeList.add(new Employee(4,"Divy", 32));
        employeeList.add(new Employee(4,"Bobby", 12));

        //System.out.println(employeeList);
        Collections.sort(employeeList);
        Collections.sort(employeeList, new SortByName());
        //System.out.println(employeeList);


        Collections.sort(employeeList, (a1, a2) -> { return a2.getAge()-a1.getAge();});
        System.out.println(employeeList);
    }
}

class SortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()-o2.getId();
    }
}