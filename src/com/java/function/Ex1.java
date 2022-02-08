package com.java.function;

import java.util.function.Function;

public class Ex1 {

    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();
        Integer length = func.apply("test");
        System.out.println("Input String length is "+length);
    }
}
