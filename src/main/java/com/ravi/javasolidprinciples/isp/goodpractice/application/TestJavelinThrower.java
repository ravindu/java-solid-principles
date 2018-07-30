package com.ravi.javasolidprinciples.isp.goodpractice.application;

import com.ravi.javasolidprinciples.isp.goodpractice.service.JavelinThrower;

public class TestJavelinThrower {

    public static void main(String[] args) {
       
        /** now Javelin thrower is not going to do running and swimming **/
        JavelinThrower javelinThrower= new JavelinThrower();
        javelinThrower.doWarnupExercises();
        javelinThrower.throwing();

    }

}
