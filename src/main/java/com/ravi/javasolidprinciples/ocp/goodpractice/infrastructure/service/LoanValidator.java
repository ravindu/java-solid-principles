package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

/**
 * Define a common boundary for Loan validation. THis will be used for any loan type validation.
 * 
 * @author ravindu.s
 *
 */
public interface LoanValidator {

    public boolean isValid();
}
