package com.java.methodrefrence.constructorRef;

public class Test {

    public static void main(String[] args) {
        StudentInfo stuInfo = Student::new;
        stuInfo.getInfo("anand");
    }
}
