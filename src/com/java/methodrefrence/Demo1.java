package com.java.methodrefrence;

public class Demo1 {
    public static void main(String[] args) {
        Hello hello1 = (a, b) ->{
            int sum = a+b;
            return sum;
        };
        int sum1= hello1.test(5,4);
        System.out.println("sum : "+sum1);

        Hello hello2 = MyInteger::findSum;
        int sum2 = hello2.test(6, 8);
        System.out.println("Method reference sum: "+sum2);

    }
}
