package com.thoughtworks.bootcamp;

public class Probability {
    double occuringProbability ;
    public Probability(double value) {
        occuringProbability = value;
    }

    public double findNonOccuringEventProbability() {
        return (1-occuringProbability);
    }
}
