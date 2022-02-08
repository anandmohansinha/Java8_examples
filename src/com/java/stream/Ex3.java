package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,2,3,4,5,6,7,8,9);
       // numsList.stream().forEach(System.out::println);

        numsList.parallelStream().forEach(System.out::println);
    }
}
