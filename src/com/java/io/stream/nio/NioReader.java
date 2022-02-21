package com.java.io.stream.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioReader {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\java_support\\Harish\\src\\com\\java\\io\\stream\\test.txt";
      //  Files.lines(Paths.get(filePath)).forEach(System.out::println);

     String str = "I am appending text in exsiting file";
        Files.write(Paths.get(filePath), str.getBytes(), StandardOpenOption.APPEND);
    }
}
