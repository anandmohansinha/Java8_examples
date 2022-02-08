package com.java.lambda.ex2;

import java.util.function.BiPredicate;

public class PredicateEx3 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> bi = (x, y) -> {return x.length() == y;};
        System.out.println(bi.test("anand", 5));
    }
}
