package com.java.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalEx1 {

    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();
        //String str = "Game of thrones";
        String str = null;
        Optional<String> optionalStr = Optional.ofNullable(str);
        StringBuilder sb = new StringBuilder("Game of thrones");
        System.out.println(optionalStr.get());
        //System.out.println(optionalStr.map(func).get());

    }


}
