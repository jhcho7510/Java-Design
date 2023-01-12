package com.dotori.pattern.strategy;

/** Korea의 정보를 획득한다. */
public class VisitorA {
    private String nationName;
    private String nationLocation;
    private String population;
    private NationDelegator nationDelegator;

    public VisitorA() {
        nationDelegator = new NationDelegator(new KoreaImpl());
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
