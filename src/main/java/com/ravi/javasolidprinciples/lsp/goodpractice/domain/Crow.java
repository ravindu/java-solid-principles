package com.ravi.javasolidprinciples.lsp.goodpractice.domain;

public class Crow extends FlightBird{

    @Override
    public void fly() {
        System.out.println("Crow can fly");
        
    }

    @Override
    public void eat() {
        System.out.println("Crow eat both veg and non veg foods");
        
    }

}
