package com.java.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Mango");
        fruits.add("Maggie");
        fruits.add("Michonne");
        fruits.add("Rick");
        fruits.add("Merle");
        fruits.add("Governor");
        //fruits.forEach( System.out::println);
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept(String.valueOf(7));

    }

}
