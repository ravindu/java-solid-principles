package com.ravi.javasolidprinciples.lsp.badpractice.domain;

public class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new RuntimeException("Ostrich can't fly");
        
    }

    @Override
    public void eat() {
        System.out.println("Ostrich eat non veg foods");
        
    }

}
