package com.java.io.stream.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindWordCount {

    public static void main(String[] args) throws IOException {
        String filePath = "src\\com\\java\\io\\stream\\test.txt";
        // task : find no of words and there count
    // java 7
        Map<String , Integer> wordCountMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while((line = br.readLine()) != null){

               String[] words = line.split(" ");
               for(String word: words){
                   if( wordCountMap.get(word)!= null) {
                       wordCountMap.put(word, wordCountMap.get(word) + 1);
                   } else {
                       wordCountMap.put(word, 1);
                   }
               }
        }
        System.out.println(wordCountMap);
    }
}
