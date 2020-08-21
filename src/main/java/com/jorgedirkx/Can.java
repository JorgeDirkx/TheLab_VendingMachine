package com.jorgedirkx;

public enum Can {

    FANTA(1.5), CASSIS(1.2), COLA(1.4);

    private double cost;

    Can(double cost) {
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }
}
