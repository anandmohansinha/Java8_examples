package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<String> indiaCricketTeam = Arrays.asList("Virat","Rohit","Bumrah");
        List<String> australia = Arrays.asList("warner", "Smith", "zampa");

       // List<Integer> list1 = Arrays.asList(1,2,3);
       // List<Integer> list2 = Arrays.asList(10,20,30);

        List<List<String>> createTeam = Arrays.asList(indiaCricketTeam, australia);
        //createTeam.stream().forEach(System.out::println);

        System.out.println("================");
       // mylist.stream().map(Collection::stream).forEach(System.out::println);

        System.out.println("===================");
        createTeam.stream().map(Collection::stream).flatMap(input -> input).forEach(System.out::println);
    }
}
