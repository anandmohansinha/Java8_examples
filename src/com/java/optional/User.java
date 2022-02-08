package com.java.optional;

import java.util.Optional;

public class User {
    private String email;
    private String position;
    private Address address;

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public Optional<String> getPosition(){
        return Optional.ofNullable(position);
    }

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
