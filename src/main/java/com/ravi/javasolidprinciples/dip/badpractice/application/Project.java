package com.ravi.javasolidprinciples.dip.badpractice.application;

import com.ravi.javasolidprinciples.dip.badpractice.service.BackendDeveloper;
import com.ravi.javasolidprinciples.dip.badpractice.service.FrontendDeveloper;

public class Project {

    FrontendDeveloper javascriptDeveloper= new FrontendDeveloper();
    BackendDeveloper javaDeveloper= new BackendDeveloper();
    
    public void implementCode(){
        javascriptDeveloper.writeJavaScript();
        javaDeveloper.writeJava();
    }
    
    public static void main(String [] args){
        Project project= new Project();
        project.implementCode();
    }
}
