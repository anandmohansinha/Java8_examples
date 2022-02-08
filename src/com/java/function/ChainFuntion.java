package com.java.function;

import java.util.function.Function;

public class ChainFuntion {
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;

      //  Integer length = func.apply("Harish");
      //Integer mul = func2.apply(func.apply("Harish"));

     // apply is function interface abstract method.
     System.out.println(func.andThen(func2).apply("test"));

    }
}
