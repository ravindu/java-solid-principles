package com.ravi.javasolidprinciples.lsp.goodpractice.domain;

public class Ostrich extends NonFlightBird {

    @Override
    public void eat() {
        System.out.println("Ostrich eat non veg foods");
        
    }

}
