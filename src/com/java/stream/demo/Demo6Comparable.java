package com.java.stream.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo6Comparable {

    public static void main(String[] args) {
        List<Student> studentList = DataUtil.getStudentList();

        //Collections.sort(studentList, courseNameComparator);
        studentList.stream().sorted(nameComparator).forEach(System.out::println);
    }









    public static final Comparator<Student> nameComparator = new Comparator<Student>(){
        @Override
        public int compare(Student stu1, Student stu2) {
            if(stu1.getSname().compareTo(stu2.getSname())>0){
                return -1;
            } else if(stu1.getSname().compareTo(stu2.getSname())<0){
                return 1;
            } else {
                return 0;
            }


        }
    };

    public static final Comparator<Student> courseNameComparator = new Comparator<Student>(){
        @Override
        public int compare(Student stu1, Student stu2) {
            return stu1.getCourseName().compareTo(stu2.getCourseName());
        }
    };


    public static final Comparator<Student> feeComparator = new Comparator<Student>(){
        @Override
        public int compare(Student stu1, Student stu2) {
            return (int) (stu1.getFeePaid() - stu2.getFeePaid());
        }
    };


}
