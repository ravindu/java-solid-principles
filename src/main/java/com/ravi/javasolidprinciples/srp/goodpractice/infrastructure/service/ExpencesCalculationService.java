package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.Loan;

public class ExpencesCalculationService {

    public void calculateGovernmentTaxes(Loan loan){
        System.out.println("Calculate government taxes");
    }
    
    public void calculateDocumentCharges(Loan loan){
        System.out.println("Calculate document charges");
    }
}
