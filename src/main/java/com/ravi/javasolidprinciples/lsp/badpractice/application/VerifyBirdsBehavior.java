package com.ravi.javasolidprinciples.lsp.badpractice.application;

import java.util.ArrayList;
import java.util.List;

import com.ravi.javasolidprinciples.lsp.badpractice.domain.Bird;
import com.ravi.javasolidprinciples.lsp.badpractice.domain.Crow;
import com.ravi.javasolidprinciples.lsp.badpractice.domain.Ostrich;

public class VerifyBirdsBehavior {

    public static void main(String[] args) {
        List<Bird> birdList= new ArrayList<>();
        birdList.add(new Crow());
        birdList.add(new Ostrich());
        for(Bird bird: birdList){
            letBirdFly(bird);
        }

    }

    private static void letBirdFly(Bird bird) {
        bird.fly();
        
    }

}
