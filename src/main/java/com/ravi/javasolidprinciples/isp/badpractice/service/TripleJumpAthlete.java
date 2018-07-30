package com.ravi.javasolidprinciples.isp.badpractice.service;

public class TripleJumpAthlete implements Athlete{

    @Override
    public void running() {
        System.out.println("Started running in first 20m");
        
    }

    @Override
    public void jumping() {
        System.out.println("Started jumping from 20m margin line");
        
    }

    @Override
    public void throwing() {
        // doesn't want to implement throwing functionality for TripleJumpAthlete
    }

    @Override
    public void swimming() {
        // doesn't want to implement swimming functionality for TripleJumpAthlete
    }

}
