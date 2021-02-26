package com.company;

public class Main {

    public static void main(String[] args) {

        Wheight wheight = new Wheight(7);
        Toilet toilet = new Toilet("wood",wheight);
        Sink sink = new Sink(2, true);

        Bathroom bathroom = new Bathroom(toilet, sink);





    }
}
