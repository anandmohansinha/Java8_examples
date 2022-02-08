package com.java.stream.demo;

import java.util.List;

/**
 *  Q4) Display the Students who has to pay the Fee Balance in Descending Order by
 *         Name
 */
public class Demo7 {

    public static void main(String[] args) {
        List<Student> studentList = DataUtil.getStudentList();
        studentList.stream()
                .filter(stu -> stu.getFeeBal()>0)
                .sorted( (stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname()))
                 .forEach(System.out::println);


    }
}
