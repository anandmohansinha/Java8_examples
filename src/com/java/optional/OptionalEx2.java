package com.java.optional;

import java.util.Optional;

public class OptionalEx2 {

    public static void main(String[] args) {
        User user = null;
              //  new User("xyz");
       // User result = Optional.ofNullable(user).orElseThrow(()->new NullPointerException());
      //  System.out.println(result.getEmail());

        User user1 = new User(null);
        // there are 3 ways to create optional object
        //1. Optiona.of()
        // 2. Optional.OfNullable();
        // 3. Optional.EMPTY
        String email = Optional.ofNullable(user1).map(u -> u.getEmail()).orElse("default@gmail.com");

        Optional.ofNullable(user1).map(u -> u.getEmail()).ifPresent(System.out::println);
        //System.out.println(email);




    }
/*
    private static Optional<User> getUser(User user) {
        User user1 = new User("anand@gmail.com");
        Optional<User> opt = Optional.ofNullable(user);
        return opt.ofNullable(user).orElse(user1);
    }*/
}
