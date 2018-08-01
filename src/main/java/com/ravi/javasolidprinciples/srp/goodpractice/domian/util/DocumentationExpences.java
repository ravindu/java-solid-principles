package com.ravi.javasolidprinciples.srp.goodpractice.domian.util;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
/**
 * Calculate only the Documentation expenses.
 * @author ravindu.s
 *
 */
public class DocumentationExpences implements ExpencesCalculator {

    @Override
    public double calculateExpences(LoanRequest request) {
        double amount= 50.00;
        try {
            // Do the bank documentation charges based on loan amount
        } catch (Exception e) {
            // Handle exceptions
        }
        return amount;
    }

}
