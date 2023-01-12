package com.dotori.pattern.strategy;

public class FranceImpl extends NationImpl {
    @Override
    public String getName() {
        return "France";
    }

    @Override
    public String getLocation() {
        return "Europe";
    }

    public String getPopulation() {
        return "6775만";
    }
}
