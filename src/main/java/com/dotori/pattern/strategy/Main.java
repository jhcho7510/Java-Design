package com.dotori.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        VisitorA va = new VisitorA();
        va.printNationInfo();
        VisitorB vb = new VisitorB();
        vb.printNationInfo();

    }
}
