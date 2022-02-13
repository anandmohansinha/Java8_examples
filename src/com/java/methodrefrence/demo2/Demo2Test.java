package com.java.methodrefrence.demo2;

public class Demo2Test {
    public static void main(String[] args) {
        Hello hello1= (a, b) ->{
          return a+b;
        };
        System.out.println(hello1.test(5, 8));


        MyInteger myIntegerRef = new MyInteger();
        Hello hello2 = myIntegerRef::findSum;
        System.out.println(hello2.test(6,6));
    }
}
