package com.ravi.javasolidprinciples.lsp.badpractice.domain;

public class Crow extends Bird {

    @Override
    public void fly() {
        System.out.println("Crow can fly");
        
    }

    @Override
    public void eat() {
        System.out.println("Crow eat both veg and non veg foods");
        
    }

}
