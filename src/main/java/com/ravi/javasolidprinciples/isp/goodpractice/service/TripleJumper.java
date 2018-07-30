package com.ravi.javasolidprinciples.isp.goodpractice.service;

public class TripleJumper implements TripleJumpAthlete {

    @Override
    public void doWarnupExercises() {
        System.out.println("Do warm up exercises");
        
    }

    @Override
    public void running() {
        System.out.println("Started running in first 20m");
        
    }

    @Override
    public void jumping() {
        System.out.println("Started jumping from 20m margin line");
        
    }

}
