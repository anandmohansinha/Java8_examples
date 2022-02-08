package com.java.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Ex3 {

    public static void main(String[] args) {
        Ex3 obj = new Ex3();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        List<Integer> list2 = Arrays.asList(1,7,6,0,5);
         Map<Integer, Integer> map = obj.convertListToMap(list2, x->x*x);
        System.out.println(map);
    }

   public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> function){

       Map<T, R> result = new HashMap<>();
       for (T t : list) {
           result.put(t, function.apply(t));
       }
       return result;
    }
}
