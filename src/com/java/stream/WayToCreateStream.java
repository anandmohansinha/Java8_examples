package com.java.stream;

import java.util.*;
import java.util.stream.Stream;

public class WayToCreateStream {

    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> mystream = numsList.stream();

        Stream<Integer> oddStream = mystream.filter(num -> num%2!=0);
        Stream<Integer> squareStream = oddStream.map(num -> num*num);
        squareStream.forEach(System.out::println);

        System.out.println("==========================");
        numsList.stream().filter(num -> num%2==0).map(num ->num*num).forEach(System.out::println);
    }


}
