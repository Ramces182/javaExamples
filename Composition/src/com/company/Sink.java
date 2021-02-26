package com.company;

public class Sink {
    private int nobs;
    private boolean water;

    public Sink(int nobs, boolean water) {
        this.nobs = nobs;
        this.water = water;
    }

    public void openSink(){
        if (water = true){
            System.out.println("water." + water + " pooring water");
        }
    }

    public int getNobs() {
        return nobs;
    }

    public boolean isWater() {
        return water;
    }
}
