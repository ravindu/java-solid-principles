package com.ravi.javasolidprinciples.dip.goodpractice.application;

import java.util.ArrayList;
import java.util.List;

import com.ravi.javasolidprinciples.dip.goodpractice.application.Project;
import com.ravi.javasolidprinciples.dip.goodpractice.service.BackendDeveloper;
import com.ravi.javasolidprinciples.dip.goodpractice.service.Developer;
import com.ravi.javasolidprinciples.dip.goodpractice.service.FrontendDeveloper;

public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implementCode() {
        for (Developer developer : developers) {
            developer.develop();
        }
    }
    
    public static void main(String [] args){
        
        List<Developer> developers= new ArrayList<>();
        developers.add(new BackendDeveloper());
        developers.add(new FrontendDeveloper());
        
        Project project= new Project(developers);
        project.implementCode();
    }
}
