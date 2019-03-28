package com.pair.exercise.service;

import com.pair.exercise.connectors.PairDataConnector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class PairServiceTest {

    @Mock
    private PairDataConnector pairDataConnector;

    private PairService pairService;

    @Before
    public void setUp() {
        pairService = new PairService(pairDataConnector);
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