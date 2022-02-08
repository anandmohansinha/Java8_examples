package com.java.supplier;

import java.util.function.Supplier;

public class SupplierEx2 {

    static  String product= "Android";
    public static void main(String[] args) {
        Supplier<Boolean> length = () -> product.length() == 8;
        Boolean l = length.get();
        System.out.println(l);

        Supplier<Integer> pl = () -> product.length();
        System.out.println(pl.get());

        Supplier<String> upper = () ->product.toUpperCase();
        System.out.println(upper.get());

    }
}
