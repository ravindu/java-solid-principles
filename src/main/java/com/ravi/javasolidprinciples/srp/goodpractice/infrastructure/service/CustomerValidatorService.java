package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.Loan;

public class CustomerValidatorService {

    public boolean verifyCustomerDetails(Loan loan){
        if(loan.getCustomerDetails()!=null){
            System.out.println("Validate customer details");
            return true;
        }
        return false;
    }
}
