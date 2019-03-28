package com.pair.exercise.service;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class PairService {


    public String pairMethod(String greeting){

        Optional.ofNullable(greeting)
                .filter(StringUtils::isNotBlank)
                .orElseThrow(() -> new IllegalArgumentException("Greeting can not be empty"));

        return "Hello".concat(" ").concat(greeting);
    }

}
