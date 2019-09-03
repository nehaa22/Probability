package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    void givenEventOfHeadAndTail_WhenFindNonOccurringProbability_ThenReturnResult()
    {
        Probability probability = new Probability(0.5);
        assertEquals(0.5,probability.findNonOccuringEventProbability());
    }
}
