package com.ravi.javasolidprinciples.srp.goodpractice.domian.util;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;

/**
 * Calculate only government taxes.
 * 
 * @author ravindu.s
 *
 */
public class GovernmentTaxCalculator implements ExpencesCalculator {
    /**
     * For the demo purpose i'm returning a default amount. There should be implemented a tax calculation logic.
     */
    @Override
    public double calculateExpences(LoanRequest request) {
        double amount = 50.00;
        try {
            // Do the government tax calculation based on loan amount
        } catch (Exception e) {
            // Handle exceptions
        }
        return amount;
    }

}
