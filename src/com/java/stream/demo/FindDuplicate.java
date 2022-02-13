package com.java.stream.demo;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Student> students = DataUtil.getStudentList();
       List<Student> unique = students.stream().collect(
               collectingAndThen(
                                 toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getCourseName)))
                                , ArrayList::new
                                )
       );


        unique.stream().forEach(System.out::println);
    }
}