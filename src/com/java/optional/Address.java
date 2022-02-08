package com.java.optional;

import java.util.Optional;

public class Address {
    private Country country;

    public Optional<Country> getCountry() {
        return Optional.ofNullable(country);
    }
}
