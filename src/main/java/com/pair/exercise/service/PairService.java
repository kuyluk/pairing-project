package com.pair.exercise.service;

import com.pair.exercise.connectors.PairDataConnector;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class PairService {

    private final PairDataConnector pairDataConnector;

    public PairService(PairDataConnector pairDataConnector) {
        this.pairDataConnector = pairDataConnector;
    }


    public String pairMethod(String greeting){

        Optional.ofNullable(greeting)
                .filter(StringUtils::isNotBlank)
                .orElseThrow(() -> new IllegalArgumentException("Greeting can not be empty"));

        return "Hello".concat(" ").concat(greeting);
    }

}
