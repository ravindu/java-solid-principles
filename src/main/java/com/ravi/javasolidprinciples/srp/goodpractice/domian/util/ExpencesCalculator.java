package com.ravi.javasolidprinciples.srp.goodpractice.domian.util;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
/**
 * Generic interface to calculate expenses.
 * @author ravindu.s
 *
 */
public interface ExpencesCalculator {

    public double calculateExpences(LoanRequest request);
}
