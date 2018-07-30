package com.ravi.javasolidprinciples.isp.badpractice.application;

import com.ravi.javasolidprinciples.isp.badpractice.service.TripleJumpAthlete;

public class TestTripleJumpAthlete {

    public static void main(String[] args) {
        TripleJumpAthlete tripleJumpAthlete = new TripleJumpAthlete();
        tripleJumpAthlete.running();
        tripleJumpAthlete.jumping();
        /**
         * This one is not relevant to TripleJumpAthlete. But Athlete interface forcing to implement inside
         * TripleJumpAthlete
         **/
        tripleJumpAthlete.throwing();
        /**
         * This one is not relevant to TripleJumpAthlete. But Athlete interface forcing to implement inside
         * TripleJumpAthlete
         **/
        tripleJumpAthlete.swimming();
    }
}
