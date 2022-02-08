package com.java.optional;

import java.util.Optional;

public class OptionalEx3 {

    public static void main(String[] args) {
        //printWord();
        printWordWithOptional();
    }

    // without Optional
    public static void printWord() {
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.println(word);
    }

    // with Optional and orElse
    public static void printWordWithOptional() {
        String[] words = new String[10];
        // using orElse method
        // inside map function is same as code inside ifPresent block
        // orElse have a code which is similar to code of IfPresent else block
        String word = Optional.ofNullable(words[5]).map(u -> u.toLowerCase()).orElse("data is not available");
        System.out.println(word);
    }

    // with Optional and IfPresent
    public void printWordWithIfPresent() {
        String[] words = new String[10];
        Optional<String> word = Optional.ofNullable(words[5]);
        if (word.isPresent()) {
            System.out.println(word.get().toLowerCase());
        } else {
            System.out.println("Data is not there");
        }
    }

}
