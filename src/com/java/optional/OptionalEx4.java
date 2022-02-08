package com.java.optional;

import java.util.Optional;

public class OptionalEx4 {

    public static void main(String[] args) {
        Optional<User> user = getUserData(false);
        User defaultUser = new User("default@gmail.com");
       // orElse
        System.out.println(user.orElse(defaultUser).getEmail());

        // orElseGet
        System.out.println(
                user.orElseGet(()->{
                    System.out.println("This is my business logic to get user data ");
                    return new User("supplier@gmail.com");
                })
        );
    }

    private static Optional<User> getUserData(boolean isAvailable) {
        User user = null;
        if(isAvailable){
            user = new User("anand@gmail.com");
        }
        return Optional.ofNullable(user);
    }
}
