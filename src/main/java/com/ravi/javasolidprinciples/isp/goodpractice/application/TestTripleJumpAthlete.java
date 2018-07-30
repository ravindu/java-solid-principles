package com.ravi.javasolidprinciples.isp.goodpractice.application;

import com.ravi.javasolidprinciples.isp.goodpractice.service.TripleJumper;

public class TestTripleJumpAthlete {

    public static void main(String[] args) {
        /** now tripleJumper is not going to do swimming and throwing **/
        TripleJumper tripleJumpAthlete = new TripleJumper();
        tripleJumpAthlete.doWarnupExercises();
        tripleJumpAthlete.running();
        tripleJumpAthlete.jumping();
    }
}
