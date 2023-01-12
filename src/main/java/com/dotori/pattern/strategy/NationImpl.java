package com.dotori.pattern.strategy;

/** Dotori Island의 정보를 획득한다. */
public class NationImpl implements NationInterface {
    @Override
    public String getName() {
        return "DotorIsland";
    }

    @Override
    public String getLocation() {
        return "The Earch";
    }

    public String getPopulation() {
        return "70억";
    }
}
