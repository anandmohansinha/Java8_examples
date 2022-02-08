package com.java.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Q5) Find the Students whose feebal >=12000, Add 1000 to all of them
 * Sort them in Descending Order by FeeBal
 * Store in ResultList.
 */
public class Demo8 {
    public static void main(String[] args) {
        List<Student> studentList = DataUtil.getStudentList();
        List<Student> finalResult = studentList.stream().filter(stu -> stu.getFeeBal()>=1000)
                .map(stu ->{
                    stu.setFeeBal(stu.getFeeBal()+1000);
                    return stu;
                }).sorted( (stu1, stu2) -> (int) (stu2.getFeeBal()-stu1.getFeeBal())).collect(Collectors.toList());

        for(Student stu: finalResult){
            System.out.println(stu);
        }
    }
}
