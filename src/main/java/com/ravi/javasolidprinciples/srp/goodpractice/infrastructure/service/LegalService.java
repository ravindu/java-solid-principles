package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;

public interface LegalService {

    public boolean getLegalVerification(LoanRequest loan);
}
