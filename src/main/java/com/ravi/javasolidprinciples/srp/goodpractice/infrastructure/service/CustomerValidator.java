package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
/**
 * A common boundary service to verify customer related details
 * @author ravindu.s
 *
 */
public interface CustomerValidator {

    public boolean verifyCustomerDetails(LoanRequest loan);
}
