package com.dotori.pattern.strategy;

public class KoreaImpl extends NationImpl {
    @Override
    public String getName() {
        return "Korea";
    }

    @Override
    public String getLocation() {
        return "Asia";
    }

    public String getPopulation(){
        return "5000만";
    }
}
