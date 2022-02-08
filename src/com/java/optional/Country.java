package com.java.optional;

import java.util.Optional;

public class Country {
    private String isoCode;

    public Optional<String> getIsoCode(){
        return Optional.ofNullable(isoCode);
    }

}
