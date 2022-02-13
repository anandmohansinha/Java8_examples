package com.java.methodrefrence;

public class Test1 {
    public static void main(String[] args) {

        Hello hello = (x, y)->x+y;
        System.out.println(hello.test(6,6));

        Hello hello2 = (x, y) -> x-y;
        System.out.println(hello2.test(9,3));

        Hello hello3 = (x, y)-> x*y;
        System.out.println(hello3.test(9,3));

        //method refrence
        Hello hello4 = MyInteger::sub;
        System.out.println(hello4.test(6,9));

      //  Hello hello5 = MyInteger::mul;
        //System.out.println(hello5.test(6,9));

    }
}
