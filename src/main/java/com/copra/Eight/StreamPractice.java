package com.copra.Eight;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee(20, "Amit", 26, "HR", "Male", 2018, 300.00),
                new Employee(11, "Prashant", 23, "Sales", "Male", 2011, 200.00),
                new Employee(14, "Priya", 22, "HR", "Female", 2007, 700.00),
                new Employee(53, "Salil", 28, "Dev", "Male", 2023, 250.00),
                new Employee(26, "Alok", 25, "Sales", "Male", 2019, 560.00),
                new Employee(42, "Monika", 28, "Dev", "Female", 2007, 320.00)
        );

        System.out.println("1. How many male and female employee are in the organization ... ?");
        Map<String, Long> maleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleAndFemale);

        System.out.println();

        System.out.println("2. Print the name of all department in list without duplicate ...?");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println();

        System.out.println("3. What is the average age of female and male employee ... ?");
        Map<String, Double> avergaeAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avergaeAge);

        System.out.println();

        System.out.println("4. Get the highest paid of employee in the Organization ... ?");
        Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(maxSalary);

        System.out.println();

        System.out.println("5. Get the Name of all employee who joined after 2010 ... ?");
        int year = 2010;
        List<Employee> joiningYear = employeeList.stream().filter(emp -> emp.getJoinYear() > year).collect(Collectors.toList());
        joiningYear.stream().map(Employee::getName).forEach(System.out::println);

        System.out.println();

        System.out.println("6. Count the number of employee in each department ... ?");
        Map<String, Long> countEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countEmployee);

        System.out.println();

        System.out.println("7. What is the average salary of each department ...? ");
        Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalary);

        System.out.println();

        System.out.println("8. Get the youngest person in the employee list from sales ...?");
        Optional<Employee> minAge = employeeList.stream().filter(emp -> (emp.getDepartment().equals("Sales"))).min(Comparator.comparingInt(Employee::getAge));
        System.out.println(minAge);

        System.out.println();

        System.out.println("9. Most experienced person in the list ...? ");
        Optional<Employee> experienced = employeeList.stream().sorted(Comparator.comparingInt(Employee::getJoinYear)).findFirst();
        System.out.println(experienced);

        System.out.println();

        System.out.println("10.  How Many male and female in sales team ...? ");
        Map<String, Long> salesTeam = employeeList.stream().filter(emp -> emp.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(salesTeam);

        System.out.println();

        System.out.println("11. Separating Employees into Different Age Groups ...?");
        Map<String, Long> ageGroups = employeeList.stream().collect(Collectors.groupingBy(emp -> {
            int age = emp.getAge();
            if (age < 25 && age > 20) return "20-24";
            else if (age < 31 && age > 24) return "25-30";
            else return "no employee";
        }, Collectors.counting()));
        System.out.println(ageGroups);

        System.out.println();

        System.out.println("12. Finding the Highest-Paid Employee in Each Department ...?");
        Map<String, Optional<Employee>> highestPaid = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        highestPaid.forEach((department, emp) -> System.out.println("department : " + department + " employee name : " + emp.get().getName() + " employee salary : " + emp.get().getSalary()));

        System.out.println();

        System.out.println("14. Identifying Employees with Tenure Over 5 Years ...?");
        employeeList.stream().filter(e -> 2023 - e.getJoinYear() > 5).forEach(employee -> System.out.println(employee.getName() + "   " + employee.getJoinYear()));

        System.out.println();

        System.out.println("15. Sorting Employees by Department and Age ...? ");
        List<Employee> employees = employeeList.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparingInt((Employee::getAge))).collect(Collectors.toList());
        employees.forEach(employee -> {
            System.out.println(employee.getName() + " " + employee.getDepartment() + " " + employee.getAge());
        });

        System.out.println();

        System.out.println("16. Average Age and Salary based on Gender and Department ...?");
        Map<String, Map<String, Map<String, Double>>> ageAndSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(
                            Employee::getDepartment,
                            Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary)
                            )
                    )));

        System.out.println();


        Stream<String> stream = Stream.of("apple", "banana", "cherry", "date");

        // Terminal operation: forEach
        stream.forEach(System.out::println); // Prints all elements: apple, banana, cherry, date

        // Short-circuit operation (attempted after terminal operation): anyMatch
        boolean anyMatchResult = stream.anyMatch(s -> s.startsWith("a")); // Results in an IllegalStateException


        Stream.of("apple", "banana", "cherry", "date")
                .limit(2) // Limits the stream to the first two elements
                .map(s -> {
                    System.out.println("Mapping: " + s);
                    return s.toUpperCase();
                }).forEach(System.out::println);




    }
}
