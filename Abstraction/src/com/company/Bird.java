package com.company;

import java.sql.SQLOutput;

public abstract class Bird extends Animal implements ICanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println(getName() + "is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "Is flapping it's wings");
    }
}
