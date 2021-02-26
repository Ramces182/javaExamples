package com.company;

public class Bathroom {
    private Toilet theToilet;
    private Sink theSink;

    public Bathroom(Toilet theToilet, Sink theSink) {
        this.theToilet = theToilet;
        this.theSink = theSink;
    }

    public Toilet getTheToilet() {
        return theToilet;
    }

    public Sink getTheSink() {
        return theSink;
    }
}
