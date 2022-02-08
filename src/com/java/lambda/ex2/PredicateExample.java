package com.java.lambda.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static List<Integer> li = Arrays.asList(2, 3, 1, 5, 6, 7, 8, 9, 12);


    public static void main(String[] args) {
       // Predicate<Integer> pred =  x->(x>5);
       // li.stream().filter(x->(x>5)).forEach(System.out::println);
        Customer cus1 = new Customer(1, "anand");

        Customer cus2 = new Customer(2, "harish");

    }
}
