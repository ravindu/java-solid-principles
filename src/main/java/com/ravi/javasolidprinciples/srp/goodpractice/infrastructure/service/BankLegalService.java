package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;

public class BankLegalService implements LegalService {

    @Override
    public boolean getLegalVerification(LoanRequest loan) {
        boolean isVerified = true;
        try {
            Assert.notNull(loan, "Loan request should be in expected format");
            // Do legal background verification
        } catch (IllegalArgumentException e) {
            // If verification fails, then isVerified should be false
            isVerified = false;
        }
        return isVerified;
    }
}
