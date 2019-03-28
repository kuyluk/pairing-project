package com.pair.exercise.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PairServiceTest {

    private PairService pairService;

    @Before
    public void setUp() {
        pairService = new PairService();
    }

    @Test
    public void pairMethod_shouldGreetsWithName() {
        String actual = pairService.pairMethod("Murat");

        assertThat(actual).isEqualTo("Hello Murat");
    }

    @Test
    public void pairMethod_shouldThrowException_whenGreetingIsEmpty() {

        assertThatThrownBy(() -> pairService.pairMethod(""))
                .hasMessage("Greeting can not be empty");
    }
}