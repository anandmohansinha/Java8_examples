package com.java.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
public static void main(String[] args) {


        List<Student> studentList = DataUtil.getStudentList();
        //studentList.stream().forEach(System.out::println);
        //System.out.println("--------------------------");

        List<Student> mylist1 = studentList.stream().collect(Collectors.toList());
        mylist1.forEach(System.out::println);
        //System.out.println("--------------------------");
    }
}