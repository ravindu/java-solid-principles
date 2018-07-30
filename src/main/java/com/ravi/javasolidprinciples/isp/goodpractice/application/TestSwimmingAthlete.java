package com.ravi.javasolidprinciples.isp.goodpractice.application;

import com.ravi.javasolidprinciples.isp.goodpractice.service.Swimmer;

public class TestSwimmingAthlete {

    public static void main(String[] args) {
        
        /** now swimmer is not going to do running and jumping **/
        Swimmer swimmingAthlete= new Swimmer();
        swimmingAthlete.doWarnupExercises();
        swimmingAthlete.swimming();

    }

}
