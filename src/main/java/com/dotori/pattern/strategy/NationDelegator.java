package com.dotori.pattern.strategy;

public class NationDelegator {
    NationInterface nationInterface;

    public NationDelegator(NationInterface nationInterface) {
        this.nationInterface = nationInterface;
    }

    public String getNationName() {
        return nationInterface.getName();
    }
    public String getNationLocation() {
        return nationInterface.getLocation();
    }

    public String getPopulation() {
        return nationInterface.getPopulation();
    }

}
