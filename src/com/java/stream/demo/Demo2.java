package com.java.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
            List<Student> studentList = DataUtil.getStudentList();
           // studentList.stream().filter(mystu -> mystu.getFeeBal()>0).forEach(System.out::println);
            System.out.println("--------------------------");
            List<Student> mylist1 = studentList.stream().filter(mystu -> mystu.getFeeBal()>0)
                                    .collect(Collectors.toList());
            mylist1.forEach(System.out::println);
            System.out.println("--------------------------");
    }
}