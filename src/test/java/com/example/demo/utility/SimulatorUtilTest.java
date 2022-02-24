package com.example.demo.utility;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SimulatorUtilTest {

    @Test
    void calculateChanceOfWinningWhenZeroSimulations() {
        assertEquals(0, SimulatorUtil.calculateChanceOfWinning(Collections.emptyList()));
    }

    @Test
    void calculateChanceOfWinningWhenAllWins() {
        assertEquals(1, SimulatorUtil.calculateChanceOfWinning(Collections.singletonList(true)));
    }

    @Test
    void calculateChanceOfWinningWhenAllLoss() {
        assertEquals(0, SimulatorUtil.calculateChanceOfWinning(Collections.singletonList(false)));
    }

    @Test
    void calculateChanceOfWinningWhen5050() {
        assertEquals(0.5, SimulatorUtil.calculateChanceOfWinning(Arrays.asList(true, false)));
    }
}
