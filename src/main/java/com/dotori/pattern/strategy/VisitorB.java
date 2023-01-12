package com.dotori.pattern.strategy;

/** France 정보를 획득한다. */
public class VisitorB {
    private String nationName;
    private String nationLocation;
    private String population;
    private NationDelegator nationDelegator;

    public VisitorB() {
        nationDelegator = new NationDelegator(new FranceImpl());
    }

    public void printNationInfo() {
        nationName = nationDelegator.getNationName();
        nationLocation = nationDelegator.getNationLocation();
        population = nationDelegator.getPopulation();
        System.out.println(String.format("Name is '[%s]' !!",nationName));
        System.out.println(String.format("Location is '[%s]' !!",nationLocation));
        System.out.println(String.format("Population is '[%s]' !!",population));
    }
}
