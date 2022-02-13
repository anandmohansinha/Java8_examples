package com.java.methodrefrence;

public class Demo1 {
    public static void main(String[] args) {
    //1.
        Hello hello1 = (a, b) ->{
            int sum = a+b;
            return sum;
        };
        int sum1= hello1.test(5,4);
        System.out.println("sum : "+sum1);
    //2.
       // Hello hello2 = MyInteger::findSum;
        MyInteger abc = new MyInteger();
        Hello hello2 = abc::mul;
        int sum2 = hello2.test(6, 8);
        System.out.println("Method reference sum: "+sum2);

        //3.
        Hello hello3 = Integer::sum;
        int sum3 = hello3.test(9, 9);
        System.out.println(sum3);

        //4.
        Hello hello4 = Integer::max;
        int max = hello4.test(8, 1);
        System.out.println("Max value: "+max);
    }
}
