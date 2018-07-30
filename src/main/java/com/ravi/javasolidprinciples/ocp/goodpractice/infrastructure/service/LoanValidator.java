package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.Loan;

public interface LoanValidator {

    public boolean isValid(Loan loan);
}
