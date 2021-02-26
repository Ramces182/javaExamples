package com.company;

public class Toilet {
    private String material;
    private Wheight Wheight;

    public Toilet(String material, com.company.Wheight wheight) {
        this.material = material;
        Wheight = wheight;
    }

    public String getMaterial() {
        return material;
    }

    public com.company.Wheight getWheight() {
        return Wheight;
    }
}
