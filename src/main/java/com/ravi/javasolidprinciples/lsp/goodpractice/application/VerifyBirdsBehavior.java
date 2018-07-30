package com.ravi.javasolidprinciples.lsp.goodpractice.application;

import java.util.ArrayList;
import java.util.List;

import com.ravi.javasolidprinciples.lsp.goodpractice.domain.Bird;
import com.ravi.javasolidprinciples.lsp.goodpractice.domain.Crow;
import com.ravi.javasolidprinciples.lsp.goodpractice.domain.FlightBird;
import com.ravi.javasolidprinciples.lsp.goodpractice.domain.Ostrich;



public class VerifyBirdsBehavior {

    public static void main(String[] args) {
        /** Bird common features **/
        List<Bird> birdList= new ArrayList<>();
        birdList.add(new Crow());
        birdList.add(new Ostrich());
        for(Bird bird: birdList){
            showBirdFeeding(bird);
        }
        /** Fly bird features **/
        List<FlightBird> flightBirds= new ArrayList<>();
        flightBirds.add(new Crow());
        birdList.add(new Ostrich());
        for(FlightBird bird: flightBirds){
            letBirdFly(bird);
        }

    }

    private static void showBirdFeeding(Bird bird) {
       bird.eat();
        
    }

    private static void letBirdFly(FlightBird bird) {
        bird.fly();
        
    }

}
