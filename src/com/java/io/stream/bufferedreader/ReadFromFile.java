package com.java.io.stream.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_support\\Harish\\src\\com\\java\\io\\stream\\test.txt"));
        String line;
        while ((line=br.readLine()) != null){
            System.out.println(line);
        }
    }
}
