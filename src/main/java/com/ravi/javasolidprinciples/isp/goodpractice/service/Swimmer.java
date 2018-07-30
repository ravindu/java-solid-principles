package com.ravi.javasolidprinciples.isp.goodpractice.service;

public class Swimmer implements SwimmingAthlete {

    @Override
    public void doWarnupExercises() {
        System.out.println("Do warm up exercises");
        
    }

    @Override
    public void swimming() {
        System.out.println("Started Swimming");
        
    }

}
