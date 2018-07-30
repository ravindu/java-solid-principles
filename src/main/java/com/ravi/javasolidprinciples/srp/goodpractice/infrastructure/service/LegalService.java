package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.Loan;

public class LegalService {

    public boolean getLegalVerification(Loan loan) {
        if (loan != null) {
            System.out.println("Check the legal conditions and previous loan staus of same or other banks");
            return true;
        }
        return false;
    }
}
