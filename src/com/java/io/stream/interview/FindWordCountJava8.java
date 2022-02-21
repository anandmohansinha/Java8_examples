package com.java.io.stream.interview;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindWordCountJava8 {

    public static void main(String[] args) throws IOException {
            Map<String, Integer> wordCountMap = new HashMap<>();
            String filePath = "src\\com\\java\\io\\stream\\test.txt";

        Function<String,  Integer> wordCount = (word)->{
            if( wordCountMap.get(word) != null){
                wordCountMap.put(word, wordCountMap.get(word)+1);
            } else {
                wordCountMap.put(word, 1);
            }
            return wordCountMap.get(word);
        };
        /**
         * how to convert list into a stream --> list.stream()
         * if we have stream of stream, we have to convert it into stream
         */
          Map<String, Integer> map =  Files.readAllLines(Paths.get(filePath)).stream()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toMap(entry -> entry, entry -> wordCount.apply(entry), (o, n)->n));
        System.out.println(map);
    }
}
