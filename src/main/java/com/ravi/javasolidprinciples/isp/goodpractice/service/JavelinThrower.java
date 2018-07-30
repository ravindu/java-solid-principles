package com.ravi.javasolidprinciples.isp.goodpractice.service;

public class JavelinThrower implements JavelinThrowAthlete {

    @Override
    public void doWarnupExercises() {
        System.out.println("Do warm up exercises");
        
    }

    @Override
    public void throwing() {
        System.out.println("Started throwing Javelin");
        
    }

}
