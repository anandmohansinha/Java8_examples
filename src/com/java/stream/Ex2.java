package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,2,3);


        Stream<Integer> mystream1 = numsList.stream();
        mystream1.forEach(System.out::println);
        /**
         * A Stream should be operated on (invoking an intermediate or terminal stream operation) only once. A Stream implementation may throw IllegalStateException if it detects that the Stream is being reused.
         */
        mystream1.forEach(System.out::println);
    }
}
